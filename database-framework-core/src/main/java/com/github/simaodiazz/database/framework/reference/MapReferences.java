package com.github.simaodiazz.database.framework.reference;

public abstract class MapReferences<K, V> extends References<V> {

    public abstract void define(K key, Ref<V> value);

    public abstract Ref<V> get(K key);

    public abstract void invalidate(K key);

}