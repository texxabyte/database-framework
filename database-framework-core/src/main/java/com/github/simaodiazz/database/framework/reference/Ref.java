package com.github.simaodiazz.database.framework.reference;

public interface Ref<T> {

    ReferenceMutability getMutability();

    ReferenceCardinality getCardinality();

}
