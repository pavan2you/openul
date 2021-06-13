package io.soul.reflect;

import io.soul.Object;
import io.soul.codec.Streamable;
import io.soul.datatype.String;

public interface Klass<T> extends Object, Streamable {

    String getName();
}
