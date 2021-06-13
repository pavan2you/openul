package io.soul.ds;

import io.soul.Object;

public interface Collection<T extends Object> extends DataStructure<T>, Iterable<T> {

    boolean contains(T element);

    boolean empty();

    int size();

    void clear();
}
