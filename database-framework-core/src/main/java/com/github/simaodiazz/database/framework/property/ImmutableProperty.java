package com.github.simaodiazz.database.framework.property;

public abstract class ImmutableProperty<K, V> implements Property<K, V> {

    private final K key;
    private final V value;

    public ImmutableProperty(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public PropertyMutability getMutability() {
        return PropertyMutability.IMMUTABLE;
    }
}