class Solution {
    fun solution(n: Int): String {
        var answer = ""
        (0 until n).forEach {
            if (it % 2 == 0) {
                answer += "수"
            } else {
                answer += "박"
            }
        }
        return answer
    }
}