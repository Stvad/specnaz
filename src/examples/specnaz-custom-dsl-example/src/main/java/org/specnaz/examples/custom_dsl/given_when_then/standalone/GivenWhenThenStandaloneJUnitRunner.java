package org.specnaz.examples.custom_dsl.given_when_then.standalone;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.specnaz.junit.core.SpecnazCoreDslJUnitRunner2_Rules;
import org.specnaz.junit.utils.Utils;

public class GivenWhenThenStandaloneJUnitRunner extends Runner {
    private final SpecnazCoreDslJUnitRunner2_Rules coreDslJUnitRunner;

    public GivenWhenThenStandaloneJUnitRunner(Class<?> classs) {
        SpecnazGivenWhenThenStandalone specInstance = Utils.instantiateTestClass(classs,
                SpecnazGivenWhenThenStandalone.class);
        GivenWhenThenCoreWrapper coreWrapper;
        try {
            coreWrapper = GivenWhenThenRegistry.get(specInstance);
        } catch (IllegalArgumentException e) {
            throw new IllegalStateException("SpecnazGivenWhenThenStandalone.given() was not called " +
                    "in the no-argument constructor of " + classs.getSimpleName());
        }
        coreWrapper.callSpecification();
        coreDslJUnitRunner = new SpecnazCoreDslJUnitRunner2_Rules(classs, coreWrapper);
    }

    @Override
    public Description getDescription() {
        return coreDslJUnitRunner.getDescription();
    }

    @Override
    public void run(RunNotifier notifier) {
        coreDslJUnitRunner.run(notifier);
    }
}
