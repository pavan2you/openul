package io.soul.ds;

public interface Collection<T> extends DataStructure<T>, Iterable<T> {

    boolean contains(T element);

    boolean empty();

    int size();

    void clear();
}
