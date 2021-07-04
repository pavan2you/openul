package io.soul.java.reflect;

import java.util.concurrent.ConcurrentHashMap;

import io.soul.SoulObject;
import io.soul.reflect.Klass;
import io.soul.reflect.KlassLoader;

public class JavaKlassLoader extends SoulObject implements KlassLoader {

    private ConcurrentHashMap<Class<?>, Klass<?>> lookup;

    public JavaKlassLoader() {
        lookup = new ConcurrentHashMap<>();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> Klass<T> klassOf(T object) {
        Class<?> tClass = object.getClass();
        Klass<T> tKlass = (Klass<T>) lookup.get(tClass);
        if (tKlass == null) {
            tKlass = new JavaKlass<>((Class<T>) object.getClass());
            lookup.put(tClass, tKlass);
        }
        return tKlass;
    }

    @Override
    public void release() {
        lookup.clear();
        lookup = null;
    }
}
