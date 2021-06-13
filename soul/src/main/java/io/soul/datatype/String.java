package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;
import io.soul.ds.Sequence;

public interface String extends Primitive, Sequence<Character>, Comparable<String>,
        Copyable<String> {
}
