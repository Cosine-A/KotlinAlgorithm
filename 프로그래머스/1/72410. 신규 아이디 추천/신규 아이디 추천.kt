class Solution {
    fun solution(newId: String): String {
        var finalId = newId.lowercase()
        val specialCharacterRegex = Regex("[^a-zA-Z0-9-_.]")
        finalId = finalId.replace(specialCharacterRegex, "")
        val periodRegex = Regex("\\.{2,}")
        finalId = finalId.replace(periodRegex, ".")
            .removePrefix(".")
            .removeSuffix(".")
        if (finalId.isEmpty()) {
            finalId = "a"
        }
        if (finalId.length >= 16) {
            finalId = finalId.substring(0..14).removeSuffix(".")
        }
        if (finalId.length <= 2) {
            val last = finalId.last()
            while (finalId.length < 3) {
                finalId += last
            }
        }
        return finalId
    }
}