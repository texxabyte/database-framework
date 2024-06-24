package com.github.simaodiazz.database.framework.reference;

import java.util.EnumMap;
import java.util.NoSuchElementException;

public class EnumMapReferences<K extends Enum<K>, V> extends MapReferences<K, V> {

    private EnumMap<K, Ref<V>> assigments;

    public EnumMapReferences() { }

    public EnumMapReferences(EnumMap<K, Ref<V>> assigments) {
        this.assigments = assigments;
    }

    @Override
    public void define(K key, Ref<V> value) {
        if (assigments == null) {
            Class<K> clazz = key.getDeclaringClass();
            this.assigments = new EnumMap<>(clazz);
        }
        this.assigments.put(key, value);
    }

    @Override
    public Ref<V> get(K key) {
        Ref<V> value = assigments.get(key);
        if (value == null) {
            throw new NoSuchElementException("Property value is null");
        }
        return assigments.get(key);
    }

    @Override
    public void invalidate(K key) {
        assigments.remove(key);
    }
}