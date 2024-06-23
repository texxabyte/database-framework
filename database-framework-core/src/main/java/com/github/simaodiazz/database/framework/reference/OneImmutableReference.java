package com.github.simaodiazz.database.framework.reference;

public class OneImmutableReference<T> extends ImmutableReference<T> {

    private OneImmutableReference(T value) {
        super(value);
    }

    public static <T> OneImmutableReference<T> of(T value) {
        return new OneImmutableReference<>(value);
    }

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.ONE;
    }
}
