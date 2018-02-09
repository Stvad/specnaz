package org.specnaz.params.impl;

import org.specnaz.impl.SinglePositiveTestCase;
import org.specnaz.impl.SingleTestCase;
import org.specnaz.impl.TestCaseType;
import org.specnaz.params.TestClosureParams1;

public final class ParametrizedTest1<P> extends AbstractParametrizedTest1<P> {
    public ParametrizedTest1(String description, TestClosureParams1<P> testBody) {
        super(description, testBody);
    }

    @Override
    protected SingleTestCase testCase(P param) {
        return new SinglePositiveTestCase(TestCaseType.REGULAR,
                formatDesc(description, param), toTestClosure(param));
    }
}