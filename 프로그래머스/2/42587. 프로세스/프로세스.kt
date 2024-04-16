import java.util.LinkedList

class Solution {
    fun solution(priorities: IntArray, location: Int): Int {
        val chars = ('A' until 'A' + priorities.size).toList()
        val map = priorities.mapIndexed { index, priority -> chars[index] to priority }
        val list = mutableListOf<Pair<Char, Int>>()
        val queue = LinkedList(map)
        while (queue.isNotEmpty()) {
            val process = queue.poll()
            if (queue.any { it.second > process.second }) {
                queue.offer(process)
            } else {
                list.add(process)
            }
        }
        val char = chars[location]
        return list.indexOfFirst { it.first == char } + 1
    }
}