package com.github.simaodiazz.database.framework.reference;

public abstract class CollectionReferences<T> extends References<T> {

    public abstract void define(Ref<T> assigment);

    public abstract void invalidate(Ref<T> assigment);

}