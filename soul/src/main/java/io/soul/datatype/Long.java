package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Long extends Number, Comparable<Long>, Copyable<Long> {

    void set(long value);

    long get();
}
