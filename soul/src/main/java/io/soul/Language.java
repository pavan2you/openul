package io.soul;

import io.soul.ds.Array;
import io.soul.ds.List;

public interface Language extends Object {

    Object newObject();

    <T> Array<T> newArray();

    <T extends Object> List<T> newList();
}
