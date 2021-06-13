package io.soul.codec;

import io.soul.io.InputStream;
import io.soul.io.OutputStream;

public interface Streamable extends Codec {

    void writeTo(OutputStream<Streamable> stream);

    Streamable readFrom(InputStream<Streamable> stream);
}
