package io.soul.reflect;

import io.soul.Object;
import io.soul.reflect.Klass;

public interface Klassifiable {

    Klass<? extends Object> getKlass();

    boolean instanceOf(Klass<?> klass);
}
