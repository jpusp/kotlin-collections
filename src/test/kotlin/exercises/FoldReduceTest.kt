package exercises

import org.junit.Assert.assertEquals
import org.junit.Test

import repository.EntitiesRepository

class FoldReduceTest {

    @Test
    fun testSumOfContributions() {
        val expected = EntitiesRepository.contributorsList()
            .map { it.amount }
            .reduce { accumulator, d ->
                accumulator + d
            }

        assertEquals(expected, FoldReduce().sumOfContributions(), 0.01)
    }

    @Test
    fun testNamesOfContributors() {
        val expected = EntitiesRepository.contributorsList()
            .map { it.name }
            .reduce { accumulator, s -> "$accumulator,$s" }

        assertEquals(expected, FoldReduce().namesOfContributors())
    }

    @Test
    fun namesOfContributorsReversed() {
        val expected = EntitiesRepository.contributorsList()
            .map { it.name }
            .reduceRight { s, accumulator  -> "$accumulator,$s" }

        assertEquals(expected, FoldReduce().namesOfContributorsReversed())
    }
}