package io.soul.io;

import io.soul.Object;
import io.soul.codec.Streamable;

public interface InputStream<T extends Streamable> extends Object, Closeable {

    T read() throws InputStreamReadException;

    int cursor();

    T[] read(int bufferSize) throws InputStreamReadException;

    int available();
}
