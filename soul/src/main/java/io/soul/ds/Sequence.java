package io.soul.ds;

public interface Sequence<T> extends DataStructure<T> {

    T elementAt(int index);

    int indexOf(T element);

    boolean empty();

    int length();

    Sequence<T> subsequence(int from, int to);
}
