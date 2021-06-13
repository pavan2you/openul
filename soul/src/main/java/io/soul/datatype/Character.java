package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Character extends Primitive, Comparable<Character>, Copyable<Character> {

    void set(char value);

    char get();
}
