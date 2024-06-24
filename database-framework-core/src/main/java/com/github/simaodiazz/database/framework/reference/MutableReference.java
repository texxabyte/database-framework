package com.github.simaodiazz.database.framework.reference;

public abstract class MutableReference<T> extends Reference<T> {

    private T assigment;

    public MutableReference() {
    }

    public MutableReference(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public T assigment() {
        return assigment;
    }

    public void sign(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public ReferenceMutability getMutability() {
        return ReferenceMutability.MUTABLE;
    }
}