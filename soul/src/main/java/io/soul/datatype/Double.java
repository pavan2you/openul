package io.soul.datatype;

import io.soul.Comparable;
import io.soul.Copyable;

public interface Double extends Number, Comparable<Double>, Copyable<Double> {

    void set(double value);

    double get();
}
