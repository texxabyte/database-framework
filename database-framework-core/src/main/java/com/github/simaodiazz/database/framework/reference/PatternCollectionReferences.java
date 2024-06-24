package com.github.simaodiazz.database.framework.reference;

import java.util.ArrayList;
import java.util.List;

public class PatternCollectionReferences<T> extends CollectionReferences<T> {

    private final List<Ref<T>> assigments;

    public PatternCollectionReferences() {
        this.assigments = new ArrayList<>();
    }

    public PatternCollectionReferences(List<Ref<T>> assigments) {
        this.assigments = assigments;
    }

    @Override
    public void define(Ref<T> assigment) {
        this.assigments.add(assigment);
    }

    public List<Ref<T>> assigments() {
        return assigments;
    }

    @Override
    public void invalidate(Ref<T> assigment) {
        this.assigments.remove(assigment);
    }
}