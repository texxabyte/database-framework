package com.github.simaodiazz.database.framework.reference;

public abstract class ImmutableReference<T> extends Reference<T> {

    private final T assigment;

    public ImmutableReference(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public T assigment() {
        return assigment;
    }

    @Override
    public ReferenceMutability getMutability() {
        return ReferenceMutability.IMMUTABLE;
    }
}