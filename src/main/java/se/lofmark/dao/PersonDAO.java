package se.lofmark.dao;

import se.lofmark.Person;

import java.util.List;

public interface PersonDAO {
    Person persist(Person person);

    Person findById (Integer id);

    Person findByEmail (String email);

    List<Person> findAll();

    void remove(Integer id);
}
