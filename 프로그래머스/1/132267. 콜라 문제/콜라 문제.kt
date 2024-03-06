class Solution {
    fun solution(need: Int, give: Int, totalBottle: Int): Int {
        var answer = 0
        var currentBottle = totalBottle
        while (currentBottle >= need) {
            val gave = (currentBottle / need) * give // 6
            answer += gave
            currentBottle = gave + (currentBottle % need) // 6 + 2[20 % 3]
        }
        return answer
    }
}