package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Float extends Number, Comparable<Float>, Copyable<Float> {

    void set(float value);

    float get();
}
