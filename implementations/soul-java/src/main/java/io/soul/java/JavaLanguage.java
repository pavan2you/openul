package io.soul.java;

import io.soul.DataStructures;
import io.soul.Language;
import io.soul.SoulObject;
import io.soul.Primitives;
import io.soul.ds.List;
import io.soul.java.ds.JavaArrayList;
import io.soul.java.reflect.JavaKlassLoader;
import io.soul.memory.Initializable;
import io.soul.memory.Releasable;
import io.soul.reflect.KlassLoader;

public class JavaLanguage extends SoulObject implements Language {

    private KlassLoader klassLoader;
    private Primitives primitives;
    private DataStructures dataStructures;

    private List<Releasable> releasables;

    public JavaLanguage() {
    }

    @Override
    public Initializable init() {
        initVariables();
        cacheVariables();
        return this;
    }

    private void initVariables() {
        klassLoader = new JavaKlassLoader();
        primitives = new JavaPrimitives();
        dataStructures = new JavaDataStructures();
    }

    private void cacheVariables() {
        releasables = new JavaArrayList<>();
        releasables.add(klassLoader);
        releasables.add(primitives);
        releasables.add(dataStructures);
    }

    @Override
    public Primitives primitives() {
        return primitives;
    }

    @Override
    public DataStructures dataStructures() {
        return dataStructures;
    }

    @Override
    public KlassLoader klassLoader() {
        return klassLoader;
    }

    @Override
    public void release() {
        for (Releasable r : releasables) {
            r.release();
        }
        nullify();
        super.release();
    }

    private void nullify() {
        releasables = null;
        klassLoader = null;
        primitives = null;
        dataStructures = null;
    }
}
