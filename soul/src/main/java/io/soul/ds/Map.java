package io.soul.ds;

import io.soul.Comparable;
import io.soul.Object;

public interface Map<K extends Object, V extends Object> extends Collection<Map.Entry<K, V>> {

    interface Entry<K extends Object, V extends Object> extends Object, Comparable<Entry<K, V>> {

        K key();

        V value();
    }
}
