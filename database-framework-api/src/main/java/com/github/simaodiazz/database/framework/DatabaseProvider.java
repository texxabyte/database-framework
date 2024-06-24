package com.github.simaodiazz.database.framework;

public interface DatabaseProvider {

    enum Relational implements DatabaseProvider {
        MYSQL,
        SQLITE
    }

    enum Memory implements DatabaseProvider {
        LOCAL
    }
}