package com.github.simaodiazz.database.framework.reference;

public abstract class ImmutableReference<T> extends MutableReference<T> {

    private final T assigment;

    public ImmutableReference(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public T getAssigment() {
        return assigment;
    }

    @Override
    public ReferenceMutability getMutability() {
        return ReferenceMutability.IMMUTABLE;
    }
}