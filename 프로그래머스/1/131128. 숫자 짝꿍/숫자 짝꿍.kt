import kotlin.math.min

class Solution {
    
    fun solution(x: String, y: String): String {
        val xList = x.groupingBy { it }.eachCount()
        val yList = y.groupingBy { it }.eachCount()
        val duplications = xList.keys.intersect(yList.keys)
        if (duplications.isEmpty()) return "-1"
        if (duplications.all { it == '0' }) return "0"
        val answers = mutableListOf<Char>()
        duplications.forEach { duplication ->
            val xSize = xList[duplication] ?: return@forEach
            val ySize = yList[duplication] ?: return@forEach
            val size = min(xSize, ySize)
            repeat(size) {
                answers.add(duplication)
            }
        }
        return answers.sortedDescending().joinToString("")
    }
}