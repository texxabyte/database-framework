package com.github.simaodiazz.database.framework.reference;

public class PatternImmutableReference<T> extends ImmutableReference<T> {

    public PatternImmutableReference(T assigment) {
        super(assigment);
    }

    public static <T> PatternImmutableReference<T> of(T assigment) {
        return new PatternImmutableReference<>(assigment);
    }
}
