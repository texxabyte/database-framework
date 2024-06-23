package com.github.simaodiazz.database.framework;

public interface DatabaseStrategy {

    enum Relational implements DatabaseStrategy {
        MYSQL,
        SQLITE
    }

    enum Memory implements DatabaseStrategy {
        LOCAL,
    }
}