package io.soul;

import io.soul.datatype.String;
import io.soul.ds.Array;
import io.soul.ds.List;
import io.soul.reflect.Klass;

public class Soul {

    private static Language language;

    public static Language language() {
        return language;
    }

    public static void set(Language language) {
        if (Soul.language != null) {
            Soul.language.release();
        }
        Soul.language = language;
    }

    public static void release() {
        set(null);
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////// Helper methods /////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////////

    public static <T> Klass<T> klassOf(T object) {
        return language.klassLoader().klassOf(object);
    }

    public static String asString(java.lang.Object nativeString) {
        return language.primitives().asString(nativeString);
    }

    public static <T> Array<T> newArray() {
        return language.dataStructures().newArray();
    }

    public static <T extends Object> List<T> newList() {
        return language().dataStructures().newList();
    }
}
