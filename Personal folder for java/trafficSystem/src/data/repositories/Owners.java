package data.repositories;

import data.models.Owner;
import data.repositories.Interfaces.OwnerRepostory;
import exceptions.OwnersExceptions.OwnerException;
import exceptions.OwnersExceptions.OwnerIdNotFoundException;
import java.util.HashMap;

public class Owners implements OwnerRepostory {
    HashMap<Integer,Owner> owners = new HashMap<>();
    long count = 0;

    @Override
    public Owner save(Owner owner) {
        if (owners.containsValue(owner)) return updateOwner(owner);
        int id = generateId();
        owner.setId(id);
        owners.put(id,owner);
        count++;
        return owner;
    }
    private Owner updateOwner(Owner owner){
        int id  = owner.getId();
        owners.put(id,owner);
        return owner;
    }
    private int generateId(){
        return (int)count + 1;
    }

    @Override
    public Owner findById(int id) {
        validateId(id);
        return owners.get(id);
    }
    private void validateId(int id){
        if(!owners.containsKey(id)) throw new OwnerIdNotFoundException("Id is not found");
    }

    @Override
    public HashMap<Integer, Owner> findAll() {
        validateOwner();
        return owners;
    }
    private void validateOwner(){
       if(owners.isEmpty()) throw new OwnerException("Oners list is empty");
    }

    @Override
    public void deleteById(int id) {
        validateId(id);
        owners.remove(id);
        count--;
    }

    @Override
    public void deleteAll() {
        validateOwner();
        owners.clear();
        count = 0;
    }

    @Override
    public void delete(Owner owner) {
        int id = owner.getId();
        owners.remove(id);
        count--;
    }

    @Override
    public long count() {
        return count;
    }
}
