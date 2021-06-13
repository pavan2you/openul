package io.soul.ds;

public interface Array<T> extends Sequence<T>, Iterable<T> {

    void set(T[] value);

    T[] get();

    void add(T element);

    T get(int index);
}
