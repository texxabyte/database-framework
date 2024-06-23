package com.github.simaodiazz.database.framework.reference;

import java.util.ArrayList;
import java.util.List;

public class ManyImmutableReference<T> extends ImmutableReference<List<T>> {

    public ManyImmutableReference() {
        super(new ArrayList<>());
    }

    public ManyImmutableReference(List<T> assigment) {
        super(assigment);
    }

    public static <T> ManyImmutableReference<T> of() {
        return new ManyImmutableReference<>();
    }

    public static <T> ManyImmutableReference<T> of(List<T> assigment) {
        return new ManyImmutableReference<>(assigment);
    }

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.MANY;
    }
}
