package com.github.simaodiazz.database.framework.reference;

import java.util.ArrayList;
import java.util.List;

public class ManyMutableReference<T> extends MutableReference<List<T>> {

    public ManyMutableReference() {
        super();
        ArrayList<T> list = new ArrayList<>();
        this.setAssigment(list);
    }

    public ManyMutableReference(List<T> assigment) {
        super(assigment);
    }

    public static <T> ManyMutableReference<T> of() {
        return new ManyMutableReference<>();
    }

    public static <T> ManyMutableReference<T> of(List<T> assigment) {
        return new ManyMutableReference<>(assigment);
    }

    @Override
    public ReferenceCardinality getCardinality() {
        return ReferenceCardinality.MANY;
    }
}
