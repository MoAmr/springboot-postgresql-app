package com.boot.demo.dao;

import com.boot.demo.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Mohammed Amr
 * @created 11/12/2020 - 23:24
 * @project demo
 */
public class FakePersonDataAccessService implements PersonDao {

    private static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName()));
        return 1;
    }
}
