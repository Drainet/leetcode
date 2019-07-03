class Solution139 {
    fun wordBreak(s: String, wordDict: List<String>): Boolean {
        return wordBreakRecursive(s, wordDict.toSet(), mutableSetOf())
    }

    private fun wordBreakRecursive(s: String, wordSet: Set<String>, cantWordBreakSet: MutableSet<String>): Boolean {
        if (s.isEmpty()) {
            return true
        }
        for (i in 0 until s.length) {
            val currentSubString = s.subSequence(0, i + 1)
            if (!wordSet.contains(currentSubString)) {
                continue
            }
            val nextSubString = s.substring(i + 1)
            if (cantWordBreakSet.contains(nextSubString)) {
                continue
            }
            val canWordBreak = wordBreakRecursive(nextSubString, wordSet, cantWordBreakSet)
            if (canWordBreak) {
                return true
            } else {
                cantWordBreakSet.add(nextSubString)
            }
        }
        return false
    }
}