package io.soul;

import io.soul.codec.Stringifiable;
import io.soul.concurrency.ThreadSignalable;
import io.soul.memory.Initializable;
import io.soul.memory.Releasable;
import io.soul.reflect.Klassifiable;

public interface Object extends
        Initializable,
        Klassifiable,
        Equatable,
        Stringifiable,
        ThreadSignalable,
        Releasable {

}
