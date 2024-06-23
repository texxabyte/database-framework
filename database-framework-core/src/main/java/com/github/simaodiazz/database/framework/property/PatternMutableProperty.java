package com.github.simaodiazz.database.framework.property;

public class PatternMutableProperty<K, V> extends MutableProperty<K, V> {

    public PatternMutableProperty(K key) {
        super(key);
    }

    public PatternMutableProperty(K key, V value) {
        super(key, value);
    }

    public static <K, V> PatternMutableProperty<K, V> of(K key) {
        return new PatternMutableProperty<>(key);
    }

    public static <K, V> PatternMutableProperty<K, V> of(K key, V value) {
        return new PatternMutableProperty<>(key, value);
    }
}
