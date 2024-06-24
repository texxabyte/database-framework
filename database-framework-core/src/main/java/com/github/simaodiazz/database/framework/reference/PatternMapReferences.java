package com.github.simaodiazz.database.framework.reference;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class PatternMapReferences<K, V> extends MapReferences<K, V> {

    private final Map<K, Ref<V>> properties;

    public PatternMapReferences() {
        this.properties = new HashMap<>();
    }

    public PatternMapReferences(Map<K, Ref<V>> properties) {
        this.properties = properties;
    }

    @Override
    public void define(K key, Ref<V> value) {
        this.properties.put(key, value);
    }

    @Override
    public Ref<V> get(K key) {
        Ref<V> value = this.properties.get(key);
        if (value == null) {
            throw new NoSuchElementException("Property value is null");
        }
        return this.properties.get(key);
    }

    @Override
    public void invalidate(K key) {
        this.properties.remove(key);
    }
}