package io.soul;

public class Soul {

    private static Language language;

    public static void set(Language language) {
        if (Soul.language != null) {
            Soul.language.release();
        }
        Soul.language = language;
    }

    public static Language language() {
        return language;
    }
}
