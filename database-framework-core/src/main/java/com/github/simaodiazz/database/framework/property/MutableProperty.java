package com.github.simaodiazz.database.framework.property;

import java.util.NoSuchElementException;

public abstract class MutableProperty<K, V> implements Property<K, V> {

    private final K key;
    private V value;

    public MutableProperty(K key) {
        this.key = key;
    }

    public MutableProperty(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        if (value == null) {
            throw new NoSuchElementException("Property value is null");
        }
        return this.value;
    }

    @Override
    public PropertyMutability getMutability() {
        return PropertyMutability.MUTABLE;
    }
}
