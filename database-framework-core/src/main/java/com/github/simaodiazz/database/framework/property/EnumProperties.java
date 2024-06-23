package com.github.simaodiazz.database.framework.property;

import java.util.*;

public class EnumProperties<E extends Enum<E>, V> implements Properties<E, V> {

    private EnumMap<E, V> properties;

    public EnumProperties() { }

    public EnumProperties(EnumMap<E, V> properties) {
        this.properties = properties;
    }

    public static <E extends Enum<E>, V> EnumProperties<E, V> of() {
        return new EnumProperties<>();
    }

    public static <E extends Enum<E>, V> EnumProperties<E, V> of(EnumMap<E, V> properties) {
        return new EnumProperties<>(properties);
    }

    @Override
    public void define(E key, V value) {

        if (properties == null) {
            Class<E> clazz = key.getDeclaringClass();
            properties = new EnumMap<>(clazz);
        }

        properties.put(key, value);
    }

    @Override
    public V get(E key) {
        V value = properties.get(key);

        if (value == null) {
            throw new NoSuchElementException("Property value is null");
        }

        return value;
    }

    @Override
    public void invalidate(E key) {
        if (properties == null) {
            throw new NullPointerException("Properties is null");
        }
        properties.remove(key);
    }

    @Override
    public Set<E> keys() {
        if (properties == null) {
            throw new NullPointerException("Properties is null");
        }
        return properties.keySet();
    }

    @Override
    public Collection<V> values() {
        if (properties == null) {
            throw new NullPointerException("Properties is null");
        }
        return properties.values();
    }
}