package io.soul.memory.ref;

import io.soul.Object;

public interface Reference<T extends Object> extends Object {

    T get();
}
