package io.quarkus.caffeine.runtime.graal;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className = "com.github.benmanes.caffeine.cache.StripedBuffer")
public class StripedBuffer {
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClassName = "com.github.benmanes.caffeine.cache.StripedBuffer", name = "tableBusy")
    private static long TABLE_BUSY;
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClass = Thread.class, name = "threadLocalRandomProbe")
    private static long PROBE;
}
