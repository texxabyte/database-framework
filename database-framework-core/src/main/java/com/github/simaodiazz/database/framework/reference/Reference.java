package com.github.simaodiazz.database.framework.reference;

public interface Reference<T> {

    T getAssigment();

    ReferenceCardinality getCardinality();

    ReferenceMutability getMutability();

}