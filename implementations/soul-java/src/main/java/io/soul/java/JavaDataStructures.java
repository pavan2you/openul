package io.soul.java;

import io.soul.Object;
import io.soul.ds.Array;
import io.soul.DataStructures;
import io.soul.ds.List;
import io.soul.SoulObject;
import io.soul.java.ds.JavaArray;
import io.soul.java.ds.JavaArrayList;

public class JavaDataStructures extends SoulObject implements DataStructures {

    @Override
    public <T> Array<T> newArray() {
        return new JavaArray<>();
    }

    @Override
    public <T extends Object> List<T> newList() {
        return new JavaArrayList<>();
    }
}
