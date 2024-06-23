package com.github.simaodiazz.database.framework.property;

public class DuplexMutableProperty<T> extends MutableProperty<T, T> {

    public DuplexMutableProperty(T key) {
        super(key);
    }

    public DuplexMutableProperty(T key, T value) {
        super(key, value);
    }

    public static <T> DuplexMutableProperty<T> of(T key) {
        return new DuplexMutableProperty<>(key);
    }

    public static <T> DuplexMutableProperty<T> of(T key, T value) {
        return new DuplexMutableProperty<>(key, value);
    }
}
