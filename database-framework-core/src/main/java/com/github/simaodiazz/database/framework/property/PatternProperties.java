package com.github.simaodiazz.database.framework.property;

import java.util.*;

public class PatternProperties<K, V> implements Properties<K, V> {

    private final Map<K, V> properties;

    public PatternProperties() {
        this.properties = new HashMap<>();
    }

    public PatternProperties(Map<K, V> properties) {
        this.properties = properties;
    }

    public static <K, V> PatternProperties<K, V> of() {
        return new PatternProperties<>();
    }

    public static <K, V> PatternProperties<K, V> of(Map<K, V> properties) {
        return new PatternProperties<>(properties);
    }

    @Override
    public void define(K key, V value) {
        properties.put(key, value);
    }

    @Override
    public V get(K key) {
        V value = properties.get(key);

        if (value == null) {
            throw new NoSuchElementException("Property value is null");
        }

        return value;
    }

    @Override
    public void invalidate(K key) {
        properties.remove(key);
    }

    @Override
    public Set<K> keys() {
        return properties.keySet();
    }

    @Override
    public Collection<V> values() {
        return properties.values();
    }
}
