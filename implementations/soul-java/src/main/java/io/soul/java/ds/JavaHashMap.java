package io.soul.java.ds;

import io.soul.SoulObject;
import io.soul.codec.Streamable;
import io.soul.ds.Iterator;
import io.soul.ds.Map;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;

public class JavaHashMap<K, V> extends SoulObject implements Map<K, V> {

    @Override
    public boolean contains(Entry<K, V> element) {
        return false;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {

    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return null;
    }
}
