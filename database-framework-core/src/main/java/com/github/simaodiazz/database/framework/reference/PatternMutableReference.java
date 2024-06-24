package com.github.simaodiazz.database.framework.reference;

public class PatternMutableReference<T> extends MutableReference<T> {

    public PatternMutableReference() {
    }

    public PatternMutableReference(T assigment) {
        super(assigment);
    }

    public static <T> PatternMutableReference<T> of() {
        return new PatternMutableReference<>();
    }

    public static <T> PatternMutableReference<T> of(T assigment) {
        return new PatternMutableReference<>(assigment);
    }
}