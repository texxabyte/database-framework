package com.github.simaodiazz.database.framework.reference;

public abstract class Reference<T> implements Ref<T> {

    public abstract T assigment();

    public abstract ReferenceMutability getMutability();

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.ONE;
    }
}