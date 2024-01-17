class Solution {
    
    private var removed = 0
    private val picks = mutableListOf<Int>()

    fun solution(boards: Array<IntArray>, moves: IntArray): Int {
        moves.forEach { line ->
            val realLine = line - 1
            for (board in boards) {
                val target = board[realLine]
                if (target == 0) continue
                board[realLine] = 0
                picks.add(target)
                addPoint()
                break
            }
        }
        return removed
    }

    private fun addPoint() {
        val size = picks.size
        val pick = picks.getOrNull(size - 2) ?: return
        if (pick == picks.last()) {
            repeat(2) {
                picks.removeLast()
                removed++
            }
        }
    }
}
