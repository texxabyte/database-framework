package com.github.simaodiazz.database.framework.property;

import java.util.Collection;
import java.util.Set;

public interface Properties<K, V> {

    void define(K key, V value);

    V get(K key);

    void invalidate(K key);

    Set<K> keys();

    Collection<V> values();

}
