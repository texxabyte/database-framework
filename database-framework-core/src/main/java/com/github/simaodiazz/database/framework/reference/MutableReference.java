package com.github.simaodiazz.database.framework.reference;

public abstract class MutableReference<T> implements Reference<T> {

    private T assigment;

    public MutableReference() {}

    public MutableReference(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public T getAssigment() {
        return assigment;
    }

    public void setAssigment(T assigment) {
        this.assigment = assigment;
    }

    @Override
    public ReferenceMutability getMutability() {
        return ReferenceMutability.MUTABLE;
    }
}