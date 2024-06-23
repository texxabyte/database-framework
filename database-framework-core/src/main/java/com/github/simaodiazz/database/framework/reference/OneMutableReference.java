package com.github.simaodiazz.database.framework.reference;

public class OneMutableReference<T> extends MutableReference<T> {

    public OneMutableReference() {
    }

    public OneMutableReference(T assigment) {
        super(assigment);
    }

    public static <T> OneMutableReference<T> of() {
        return new OneMutableReference<>();
    }

    public static <T> OneMutableReference<T> of(T assigment) {
        return new OneMutableReference<>(assigment);
    }

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.ONE;
    }
}
