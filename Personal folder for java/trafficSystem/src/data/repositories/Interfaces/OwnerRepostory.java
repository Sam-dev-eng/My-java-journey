package data.repositories.Interfaces;

import data.models.Owner;

import java.util.HashMap;

public interface OwnerRepostory {
    Owner save(Owner owner);
    Owner findById(int id);
    HashMap<Integer,Owner> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Owner owner);
    long count();
}
