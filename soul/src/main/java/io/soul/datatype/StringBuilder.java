package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;
import io.soul.ds.Sequence;

public interface StringBuilder extends Primitive, Sequence<Character>, Comparable<StringBuilder>,
        Copyable<StringBuilder> {
}
