package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Boolean extends Primitive, Comparable<Boolean>, Copyable<Boolean> {

    void set(boolean value);

    boolean get();
}
