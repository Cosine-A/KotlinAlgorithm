class Solution {
    fun solution(n: Int, m: Int, sections: IntArray): Int {
        var answer = 0
        var beforePainted = 0
        for (section in sections) {
            if (section < beforePainted) continue
            answer++
            beforePainted = section + m
        }
        return answer
    }
}