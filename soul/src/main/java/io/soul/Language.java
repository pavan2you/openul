package io.soul;

import io.soul.reflect.KlassLoader;

public interface Language extends Object {

    KlassLoader klassLoader();

    Primitives primitives();

    DataStructures dataStructures();
}
