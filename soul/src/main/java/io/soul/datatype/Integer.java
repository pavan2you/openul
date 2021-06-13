package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Integer extends Number, Comparable<Integer>, Copyable<Integer> {

    void set(int value);

    int get();
}
