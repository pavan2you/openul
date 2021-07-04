package io.soul.reflect;

import io.soul.Object;

public interface KlassLoader extends Object {

    <T> Klass<T> klassOf(T object);
}
