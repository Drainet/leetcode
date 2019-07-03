class Solution49 {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val resultMap = mutableMapOf<IntArrayKey, MutableList<String>>()
        val aInt = 'a'.toInt()
        strs.forEach { str ->
            val charCountArray = str.fold(IntArray(26) { 0 }) { acc, char ->
                acc[char.toInt() - aInt] = acc[char.toInt() - aInt] + 1
                acc
            }
            val existList = resultMap[IntArrayKey(charCountArray)]
            if (existList != null) {
                existList.add(str)
            } else {
                resultMap[IntArrayKey(charCountArray)] = mutableListOf(str)
            }
        }
        return resultMap.toList().map { it.second }
    }

    class IntArrayKey(val intArray: IntArray) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (javaClass != other?.javaClass) return false
            other as IntArrayKey
            if (!intArray.contentEquals(other.intArray)) return false
            return true
        }

        override fun hashCode(): Int {
            return intArray.contentHashCode()
        }
    }
}