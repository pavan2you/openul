package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Short extends Number, Comparable<Short>, Copyable<Short> {

    void set(short value);

    short get();
}
