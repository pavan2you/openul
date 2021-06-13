package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Byte extends Number, Comparable<Byte>, Copyable<Byte> {

    void set(byte value);

    byte get();
}
