/**
 * 두 분수를 더한 값을 기약분수로 나타냈을때 분자와 분모
 *  numer1/denom1 + numer2/denom2
 *
 *  (numer1*denom2 + numer2*denom1)/ denom1*denom2
 */


class Solution {
    private fun getGcd(x: Int, y: Int): Int {
        return if (y == 0) x else getGcd(y, x % y)
    }

    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()

        val numerator = numer1 * denom2 + numer2 * denom1
        val denominator = denom1 * denom2
        var gcd = 1
        gcd = if (numerator > denominator) getGcd(numerator, denominator)
        else getGcd(denominator, numerator)


        answer = intArrayOf(numerator / gcd, denominator / gcd)
        return answer
    }
}

fun main() {
    Solution().solution(2,8,2,8) //


    Solution().solution(1, 2, 3, 4) // [5,4]
    Solution().solution(9, 2, 1, 3)// [29,6]

}