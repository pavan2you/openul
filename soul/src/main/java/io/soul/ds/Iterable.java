package io.soul.ds;

import io.soul.Object;

public interface Iterable<T> extends Object, java.lang.Iterable<T> {

    Iterator<T> iterator();
}
