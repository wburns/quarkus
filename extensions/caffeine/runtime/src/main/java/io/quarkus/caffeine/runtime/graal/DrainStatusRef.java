package io.quarkus.caffeine.runtime.graal;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className = "com.github.benmanes.caffeine.cache.DrainStatusRef")
public class DrainStatusRef {
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.TranslateFieldOffset, name = "drainStatus")
    private static long P_INDEX_OFFSET;
}
