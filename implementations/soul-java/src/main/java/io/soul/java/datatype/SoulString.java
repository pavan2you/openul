package io.soul.java.datatype;

import java.io.Serializable;

import io.soul.codec.Streamable;
import io.soul.datatype.Character;
import io.soul.datatype.String;
import io.soul.ds.Sequence;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;
import io.soul.java.SoulObject;

public class SoulString extends SoulObject<java.lang.String> implements String, Serializable {

    public SoulString(java.lang.String string) {
        super(string);
    }

    @Override
    public int compareTo(String other) {
        return actual.compareTo(((SoulString) other).actual);
    }

    @Override
    public String copy() {
        return new SoulString(actual);
    }

    @Override
    public Character elementAt(int index) {
        return new SoulCharacter(actual.charAt(index));
    }

    @Override
    public int indexOf(Character element) {
        return actual.indexOf(element.get());
    }

    @Override
    public boolean empty() {
        return actual.isEmpty();
    }

    @Override
    public int length() {
        return actual.length();
    }

    @Override
    public Sequence<Character> subsequence(int from, int to) {
        return new SoulString(actual.substring(from, to));
    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {
        stream.write(this);
    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return stream.read();
    }
}
