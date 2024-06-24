package com.github.simaodiazz.database.framework.reference;

public abstract class Reference<T> implements Ref<T> {

    public abstract T assigment();

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.ONE;
    }
}