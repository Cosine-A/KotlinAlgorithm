class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val playerMap = mutableMapOf<String, Int>()
        val rankMap = mutableMapOf<Int, String>()

        players.forEachIndexed { index, player ->
            playerMap[player] = index
            rankMap[index] = player
        }
        callings.forEachIndexed { index, calling ->
            val callingIndex = playerMap[calling]!!

            val nextPlayerIndex = callingIndex - 1
            val nextPlayer = rankMap[nextPlayerIndex]!!

            playerMap[calling] = nextPlayerIndex
            rankMap[nextPlayerIndex] = calling

            playerMap[nextPlayer] = callingIndex
            rankMap[callingIndex] = nextPlayer
        }
        return Array(players.size) { rankMap[it]!! }
    }
}