class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        var differences = x xor y
        var result = 0
        while (differences > 0) {
            if (differences % 2 != 0) {
                result++
            }
            differences = differences shr 1
        }
        
        return result
    }
}
