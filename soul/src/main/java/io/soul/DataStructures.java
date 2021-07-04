package io.soul;

import io.soul.ds.Array;
import io.soul.ds.List;

public interface DataStructures extends Object {

    <T> Array<T> newArray();

    <T extends Object> List<T> newList();

}
