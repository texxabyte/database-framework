package com.github.simaodiazz.database.framework.property;

public class DuplexImmutableProperty<T> extends ImmutableProperty<T, T> {

    public DuplexImmutableProperty(T key, T value) {
        super(key, value);
    }

    public static <T> DuplexImmutableProperty<T> of(T key, T value) {
        return new DuplexImmutableProperty<>(key, value);
    }
}
