package io.soul.java.datatype;

import io.soul.codec.Streamable;
import io.soul.datatype.Character;
import io.soul.io.InputStream;
import io.soul.io.OutputStream;
import io.soul.SoulObject;

public class JavaCharacter extends SoulObject implements Character {

    public JavaCharacter(char ch) {
    }

    @Override
    public void set(char value) {

    }

    @Override
    public char get() {
        return 0;
    }

    @Override
    public int compareTo(Character other) {
        return 0;
    }

    @Override
    public Character copy() {
        return null;
    }

    @Override
    public void writeTo(OutputStream<Streamable> stream) {

    }

    @Override
    public Streamable readFrom(InputStream<Streamable> stream) {
        return null;
    }
}
