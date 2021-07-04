package io.soul.ds;

import io.soul.Comparable;
import io.soul.Object;

public interface Map<K, V> extends Collection<Map.Entry<K, V>> {

    interface Entry<K, V> extends Object, Comparable<Entry<K, V>> {

        K key();

        V value();
    }
}
