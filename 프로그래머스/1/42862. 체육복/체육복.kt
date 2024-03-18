class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val losts = lost.filter { !reserve.contains(it) }.sorted().toMutableList()
        var answer = n - losts.size
        println("first answer: $answer")
        val reserves = reserve.filter { !lost.contains(it) }.sorted()
        var beforeReceived = -1
        println("losts: $losts")
        println("reserves: $reserves")
        println("ㅡㅡㅡㅡ")
        reserves.forEach { student ->
            val beforeStudent = student - 1
            val nextStudent = student + 1
            println("beforeStudent: $beforeStudent")
            println("student: $student")
            println("nextStudent: $nextStudent")
            val isBeforeStudentLost = losts.contains(beforeStudent)
            val isNextStudentLost = losts.contains(nextStudent)
            if (isBeforeStudentLost && beforeReceived == beforeStudent) return@forEach
            if (isNextStudentLost && beforeReceived == nextStudent) return@forEach
            if (isBeforeStudentLost || isNextStudentLost) {
                println("give student: $student")
                if (isBeforeStudentLost) {
                    beforeReceived = beforeStudent
                    losts.remove(beforeStudent)
                    answer++
                    println("received (before)student: $beforeStudent")
                } else if (isNextStudentLost) {
                    beforeReceived = nextStudent
                    losts.remove(nextStudent)
                    answer++
                    println("received (next)student: $nextStudent")
                }
                println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ")
            }
        }
        return answer
    }
}