package io.soul.ds;

import io.soul.Object;

public interface Iterator<T> extends Object, java.util.Iterator<T> {

    boolean hasNext();

    T next();
}
