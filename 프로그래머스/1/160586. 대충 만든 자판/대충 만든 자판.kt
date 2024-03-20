class Solution {

    fun solution(keymap: Array<String>, targets: Array<String>): IntArray {
        val answer = IntArray(targets.size) { 0 }
        val keyMap = mutableMapOf<String, Int>()
        keymap.forEach { keys ->
            keys.forEachIndexed { index, key ->
                val finalKey = key.toString()
                val finalIndex = index + 1
                if (keyMap.containsKey(finalKey)) {
                    val count = keyMap[finalKey]!!
                    println("[$finalKey] $count > $finalIndex")
                    if (count <= finalIndex) return@forEachIndexed
                }
                keyMap[finalKey] = finalIndex
            }
        }
        println(keyMap)
        targets.forEachIndexed { index, target ->
            val numbers = target.map { keyMap[it.toString()] ?: -1 }
            answer[index] = if (numbers.contains(-1)) -1 else numbers.sum()
        }
        return answer
    }
}