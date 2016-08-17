package org.specnaz.tests

import org.assertj.core.api.Assertions.assertThat
import org.specnaz.SpecName
import org.specnaz.junit.SpecnazJUnit

@SpecName("arithmetic functions")
class BasicSpecnazTest : SpecnazJUnit({
    var two = -2

    it.beforeAll {
        two += 2
    }

    it.beforeEach {
        two++
    }

    it.beforeEach {
        two++
    }

    it.should("sum two numbers correctly") {
        assertThat(two + 2).isEqualTo(4)
    }

    it.should("subtract two numbers correctly") {
        assertThat(two - 2).isZero()
    }

    it.spec("with a subgroup") {
        it.should("the parent before callbacks are not called") {
            assertThat(two).isEqualTo(-2)
        }

        it.afterEach {
            two--
        }

        it.spec("and a third-degree subgroup") {
            it.should("the parent after callbacks are not called as well") {
                assertThat(two).isEqualTo(-3)
            }
        }
    }

    it.afterEach {
        two--
    }

    it.afterEach {
        two--
    }

    it.afterAll {
        assertThat(two).isZero()
        two -= 2
    }
})
