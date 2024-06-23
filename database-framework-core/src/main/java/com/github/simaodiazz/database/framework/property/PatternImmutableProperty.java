package com.github.simaodiazz.database.framework.property;

public class PatternImmutableProperty<K, V> extends ImmutableProperty<K, V> {

    public PatternImmutableProperty(K key, V value) {
        super(key, value);
    }

    public static <K, V> PatternImmutableProperty<K, V> of(K key, V value) {
        return new PatternImmutableProperty<>(key, value);
    }
}