package data.repositories.Interfaces;

import data.models.Officer;

import java.util.HashMap;

public interface OfficerRepository {
    Officer save(Officer officer);
    Officer findById(int id);
    HashMap<Integer,Officer> findAll();
    void deleteById(int id);
    void deleteAll();
    void delete(Officer officer);
    long count();
}
