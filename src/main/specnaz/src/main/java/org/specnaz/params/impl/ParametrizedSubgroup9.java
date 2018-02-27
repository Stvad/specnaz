package org.specnaz.params.impl;

import org.specnaz.impl.TestCaseType;
import org.specnaz.params.RunnableParams9;

import java.util.List;

public final class ParametrizedSubgroup9<P1, P2, P3, P4, P5, P6, P7, P8, P9> extends
        AbstractParametrizedSubgroup {
    private final RunnableParams9<P1, P2, P3, P4, P5, P6, P7, P8, P9> specClosure;

    public ParametrizedSubgroup9(String description, RunnableParams9<P1, P2, P3, P4, P5, P6, P7, P8, P9> specClosure,
            TestCaseType testCaseType) {
        super(description, testCaseType);
        this.specClosure = specClosure;
    }

    @Override
    protected Runnable toSpecClosure(List<?> params) {
        return () -> specClosure.invoke((P1) params.get(0), (P2) params.get(1), (P3) params.get(2), (P4) params.get(3),
                (P5) params.get(4), (P6) params.get(5), (P7) params.get(6), (P8) params.get(7), (P9) params.get(8));
    }
}
