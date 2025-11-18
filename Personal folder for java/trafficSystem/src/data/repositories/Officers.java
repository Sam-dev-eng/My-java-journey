package data.repositories;

import data.models.Officer;
import data.repositories.Interfaces.OfficerRepository;
import exceptions.OfficerExceptions.EmptyOfficersException;
import exceptions.OfficerExceptions.OfficerException;
import exceptions.OfficerExceptions.OfficerIdNotFoundException;

import java.util.HashMap;

public class Officers implements OfficerRepository {
    private static final HashMap<Integer,Officer> officers = new HashMap<>();
    private static long count = 0;
    @Override
    public Officer save(Officer officer) {
        if(officers.containsValue(officer)) return updateOfficer(officer);
        int id = generateId();
        officer.setId(id);
        officers.put(id,officer);
        count++;
        return  officer;
    }
    private Officer updateOfficer(Officer officer){
        int id = officer.getId();
        officers.put(id,officer);
        return officer;
    }
    private int generateId(){
        return (int)count + 1;
    }

    @Override
    public Officer findById(int id) {
        validateId(id);
        return officers.get(id);
    }
    private void validateId(int id){
        if(!officers.containsKey(id)) throw new OfficerIdNotFoundException("Id not found");
    }

    @Override
    public HashMap<Integer, Officer> findAll() {
        validateOfficers();
        return officers;
    }

    @Override
    public void deleteById(int id) {
        validateId(id);
        officers.remove(id);
    }

    @Override
    public void deleteAll() {
        validateOfficers();
        officers.clear();
        count = 0;
    }
    private void validateOfficers(){
        if(officers.isEmpty()) throw new EmptyOfficersException("List of Officers is Empty");
    }

    @Override
    public void delete(Officer officer) {
        validateOfficers(officer);
        int id = officer.getId();
        officers.remove(id);
        count--;

    }

    private void validateOfficers(Officer officer) {
        if(!officers.containsValue(officer)) throw new OfficerException("Officer not found");
    }

    @Override
    public long count() {
        return count;
    }
}
