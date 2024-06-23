package com.github.simaodiazz.database.framework.property;

public interface Property<K, V> {

    K getKey();

    V getValue();

    PropertyMutability getMutability();

}