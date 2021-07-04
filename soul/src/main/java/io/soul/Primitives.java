package io.soul;

import io.soul.datatype.Integer;
import io.soul.datatype.Long;
import io.soul.datatype.String;

public interface Primitives extends Object {

    String asString(java.lang.Object nativeString);

    Integer asInt(java.lang.Object nativeInteger);

    Long asLong(java.lang.Object nativeLong);
}
