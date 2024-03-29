import java.util.Collections;

class Solution {
    fun solution(s: String): String {
        val numbers = s.split(" ").map(String::toInt)
        return "${Collections.min(numbers)} ${Collections.max(numbers)}"
    }
}