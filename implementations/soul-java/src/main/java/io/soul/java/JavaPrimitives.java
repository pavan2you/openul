package io.soul.java;

import io.soul.datatype.Integer;
import io.soul.datatype.Long;
import io.soul.Primitives;
import io.soul.datatype.String;
import io.soul.SoulObject;
import io.soul.java.datatype.JavaString;

public class JavaPrimitives extends SoulObject implements Primitives {

    @Override
    public String asString(Object nativeString) {
        return new JavaString((java.lang.String) nativeString);
    }

    @Override
    public Integer asInt(Object nativeInteger) {
        return null;
    }

    @Override
    public Long asLong(Object nativeInteger) {
        return null;
    }
}
