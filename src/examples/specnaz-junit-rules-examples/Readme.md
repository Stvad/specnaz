Specnaz support for JUnit Rules
-------------------------------

This sub-project shows examples of tests leveraging Specnaz's support for the
[JUnit Rules API](https://github.com/junit-team/junit4/wiki/rules).
The project contains different packages, demonstrating using various pre-existing Rules:

* [built_in_rules](src/test/java/built_in_rules) shows examples of using Rules that are distributed with JUnit,
   like [ExpectedException](http://junit.org/junit4/javadoc/4.12/org/junit/rules/ExpectedException.html)
   and [TestName](http://junit.org/junit4/javadoc/4.12/org/junit/rules/TestName.html)
* [mockito](src/test/java/mockito) shows how to use
   [Mockito's JUnit Rule](https://static.javadoc.io/org.mockito/mockito-core/1.10.19/org/mockito/junit/MockitoRule.html)
   in Specnaz
* [spring](src/test/java/spring) shows how to use the
   [Spring JUnit Rules](https://docs.spring.io/spring/docs/current/spring-framework-reference/testing.html#testcontext-junit4-rules)
   in Specnaz
* [dropwizard](src/test/java/dropwizard) shows how to use
   [Dropwizard's ResourceTestRule](http://www.dropwizard.io/1.2.2/docs/manual/testing.html#testing-resources)
   in Specnaz

Check out the [main documentation on JUnit Rules](../../../docs/reference-manual.md#junit-rules)
for more details on how to use JUnit Rules in Specnaz.
