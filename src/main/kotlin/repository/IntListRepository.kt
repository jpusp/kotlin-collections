package repository

object IntListRepository {

    fun getIntList(from: Int, to: Int): List<Int> {
        return IntRange(from, to).toList()
    }

    fun getIntArray(from: Int, to: Int): Array<Int> {
        return IntRange(from, to).toList().toTypedArray()
    }
}