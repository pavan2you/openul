package io.soul.java.datatype;

import java.io.Serializable;

import io.soul.codec.Streamable;
import io.soul.datatype.Character;
import io.soul.datatype.String;
import io.soul.ds.Sequence;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;
import io.soul.SoulObject;

public class JavaString extends SoulObject implements String, Serializable {

    private final java.lang.String actual;

    public JavaString() {
        this("");
    }

    public JavaString(java.lang.String actual) {
        this.actual = actual;
    }

    @Override
    public int compareTo(String other) {
        return actual.compareTo(((JavaString) other).actual);
    }

    @Override
    public String copy() {
        return new JavaString(actual);
    }

    @Override
    public Character elementAt(int index) {
        return new JavaCharacter(actual.charAt(index));
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
        return new JavaString(actual.substring(from, to));
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
