package org.specnaz.params.impl;

import org.specnaz.core.CoreDslBuilder;
import org.specnaz.impl.SpecBuilderCoreDslAdapter;
import org.specnaz.params.ParamsExpected1;
import org.specnaz.params.ParamsExpectedException1;
import org.specnaz.params.ParamsSpecBuilder;
import org.specnaz.params.TestClosureParams1;

public final class ParamsSpecBuilderCoreDslAdapter extends SpecBuilderCoreDslAdapter
        implements ParamsSpecBuilder {
    public ParamsSpecBuilderCoreDslAdapter(CoreDslBuilder coreDslBuilder) {
        super(coreDslBuilder);
    }

    @Override
    public <P> ParamsExpected1<P> should(String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.parametrizedTest1(shouldDescription(description), testBody);
    }

    @Override
    public <T extends Throwable, P> ParamsExpectedException1<T, P> shouldThrow(Class<T> expectedException,
            String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.parametrizedTestExpectingException1(expectedException,
                shouldThrowDescription(expectedException, description), testBody);
    }

    @Override
    public <P> ParamsExpected1<P> fshould(String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.focusedParametrizedTest1(shouldDescription(description), testBody);
    }

    @Override
    public <T extends Throwable, P> ParamsExpectedException1<T, P> fshouldThrow(Class<T> expectedException,
            String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.focusedParametrizedTestExpectingException1(expectedException,
                shouldThrowDescription(expectedException, description), testBody);
    }

    @Override
    public <P> ParamsExpected1<P> xshould(String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.ignoredParametrizedTest1(description, testBody);
    }

    @Override
    public <T extends Throwable, P> ParamsExpectedException1<T, P> xshouldThrow(Class<T> expectedException,
            String description, TestClosureParams1<P> testBody) {
        return coreDslBuilder.ignoredParametrizedTestExpectingException1(expectedException,
                shouldThrowDescription(expectedException, description), testBody);
    }
}
