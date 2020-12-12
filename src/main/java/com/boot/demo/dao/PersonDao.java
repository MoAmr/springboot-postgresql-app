package com.boot.demo.dao;

import com.boot.demo.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Mohammed Amr
 * @created 11/12/2020 - 23:21
 * @project demo
 */
public interface PersonDao {

    int insertPerson(UUID id, Person person);

    // Random generated ID
    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
