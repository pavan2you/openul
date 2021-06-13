package io.soul.codec;

import io.soul.datatype.String;

public interface Stringifiable extends Codec {

    String stringify();
}
