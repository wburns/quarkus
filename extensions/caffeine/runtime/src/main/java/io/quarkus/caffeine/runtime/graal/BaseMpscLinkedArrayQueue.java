package io.quarkus.caffeine.runtime.graal;

import com.oracle.svm.core.annotate.Alias;
import com.oracle.svm.core.annotate.RecomputeFieldValue;
import com.oracle.svm.core.annotate.TargetClass;

@TargetClass(className = "com.github.benmanes.caffeine.cache.BaseMpscLinkedArrayQueue")
public class BaseMpscLinkedArrayQueue {
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClassName = "com.github.benmanes.caffeine.cache.BaseMpscLinkedArrayQueueProducerFields", name = "producerIndex")
    private static long P_INDEX_OFFSET;
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClassName = "com.github.benmanes.caffeine.cache.BaseMpscLinkedArrayQueueConsumerFields", name = "consumerIndex")
    private static long C_INDEX_OFFSET;
    @Alias
    @RecomputeFieldValue(kind = RecomputeFieldValue.Kind.FieldOffset, declClassName = "com.github.benmanes.caffeine.cache.BaseMpscLinkedArrayQueueColdProducerFields", name = "producerLimit")
    private static long P_LIMIT_OFFSET;
}
