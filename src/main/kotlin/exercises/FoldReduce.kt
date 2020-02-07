package exercises

import repository.EntitiesRepository.contributorsList

class FoldReduce {

    //In this class we will use fold or reduce functions

    /*
    * Given
    *   - a list of contributions
    * change the code below to return
    *   - the sum of all individual contributions
    */
    fun sumOfContributions(): Double {
        val amountList = contributorsList().map { it.amount }.toList()

        // your code here

        return 0.0
    }


    /*
    * Given
    *   - a list of contributions
    * Change the code below to return
    *   - a string containing the name of all individual
    *   contributors separated by a comma without space
    */
    fun namesOfContributors(): String {
        val namesList = contributorsList().map { it.name }.toList()

        // your code here

        return ""
    }


    /*
    * Sometimes the operation order matters...
    *
    * Given
    *   - a list of contributions
    * Change the code below to return
    *   - a string containing the name of all individual
    *   contributors with reversed order (last first)
    *   separated by a comma without space
    */
    fun namesOfContributorsReversed(): String {
        val namesList = contributorsList().map { it.name }.toList()

        // your code here

        return ""
    }
}