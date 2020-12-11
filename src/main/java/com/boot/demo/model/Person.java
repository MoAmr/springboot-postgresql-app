package com.boot.demo.model;

import java.util.UUID;

/**
 * @author Mohammed Amr
 * @created 11/12/2020 - 23:20
 * @project demo
 */
public class Person {

    private final UUID id;
    private final String name;

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
