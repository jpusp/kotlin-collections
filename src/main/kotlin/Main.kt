import repository.IntListRepository

class Main {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            print("testes")


            val intList = IntListRepository.getIntList(1, 100)

            val folded = intList.fold(10) { accumulator, value ->
                println("accumulator: $accumulator, value: $value")
                accumulator + value
            }
            println(folded) // 10+1+2+3 = 16
            println("---")

            val reduced = intList.reduce { accumulator, i ->
                println("accumulator: $accumulator, value: $i")
                accumulator + i
            }

            val stringList = listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j")
            val stringReduced: String = stringList.reduce { acc, s ->
                println("accumulator: $acc, value: $s")
                acc + s
            }

            println(stringReduced)
            println("---")
        }
    }

}
