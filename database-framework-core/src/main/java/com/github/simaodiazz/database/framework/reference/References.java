package com.github.simaodiazz.database.framework.reference;

public abstract class References<T> implements Ref<T> {

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.MANY;
    }
}