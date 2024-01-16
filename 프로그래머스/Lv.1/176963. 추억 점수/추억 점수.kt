class Solution {
    fun solution(names: Array<String>, yearnings: IntArray, photos: Array<Array<String>>): IntArray {
        val yearningMap = mutableMapOf<String, Int>()
        names.indices.forEach {
            val name = names[it]
            val yearning = yearnings[it]
            yearningMap[name] = yearning
            println("사람: $name, 그리움: $yearning")
        }
        return photos.map { photo ->
            photo.sumOf { yearningMap.getOrDefault(it, 0) }
        }.toIntArray()
    }
}