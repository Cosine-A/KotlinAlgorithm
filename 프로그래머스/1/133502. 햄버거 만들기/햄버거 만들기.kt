import java.util.regex.Pattern

class Solution {
    fun solution(ingredient: IntArray): Int {
        var count = 0
        val builder = StringBuilder()
        for (element in ingredient) {
            builder.append(element)
            val length = builder.length
            if (length > 3 && builder.subSequence(length - 4, length) == "1231") {
                builder.delete(length - 4, length)
                count++
            }
        }
        return count
    }
}