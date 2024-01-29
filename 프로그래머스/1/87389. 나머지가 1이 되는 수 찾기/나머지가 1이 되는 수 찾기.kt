class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        for (loop in 2 until n) {
            if (n % loop == 1) {
                answer = loop
                break;
            }
        }
        return answer
    }
}