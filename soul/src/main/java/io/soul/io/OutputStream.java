package io.soul.io;

import io.soul.Object;
import io.soul.codec.Streamable;

public interface OutputStream<T extends Streamable> extends Object, Closeable {

    void write(T streamable) throws OutputStreamWriteException;

    void write(T[] streamables) throws OutputStreamWriteException;

    int written();
}
