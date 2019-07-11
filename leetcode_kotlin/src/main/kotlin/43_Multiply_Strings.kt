import java.lang.Math.max
import java.lang.StringBuilder

class Solution43 {
    private val zeroAscii = '0'.toInt()
    fun multiply(num1: String, num2: String): String {
        var result = "0"
        for (i in 0 until num2.length) {
            val currentNum = (num2[num2.length - 1 - i]).toInt() -  zeroAscii
            var product = multiply(num1, currentNum)
            repeat(i) {
                product += '0'
            }
            result = add(result, product)
        }
        while (result.length >= 2 && result[0] == '0'){
            result = result.substring(1, result.length)
        }
        return result
    }


    private fun multiply(numString: String, int: Int) : String{
        val stringBuilder = StringBuilder()
        var carry = 0
        for (i in 0 until numString.length) {
            val currentNum = (numString[numString.length - 1 - i]).toInt() -  zeroAscii
            val sum = currentNum * int + carry
            val num = sum % 10
            stringBuilder.insert(0, num)
            carry = sum / 10
        }
        if (carry != 0) {
            stringBuilder.insert(0, carry)
        }
        return stringBuilder.toString()
    }


    private fun add(num1String: String, num2String: String): String {
        val stringBuilder = StringBuilder()
        var carry = 0
        for (i in 0 until max(num1String.length, num2String.length)) {
            val num1 = num1String.getOrNull(num1String.length - 1 - i)?.toInt()?.let { it - zeroAscii } ?: 0
            val num2 = num2String.getOrNull(num2String.length - 1 - i)?.toInt()?.let { it - zeroAscii } ?: 0
            val sum = num1 + num2 + carry
            val num = sum % 10
            stringBuilder.insert(0, num)
            carry = sum / 10
        }
        if (carry != 0) {
            stringBuilder.insert(0, carry)
        }
        return stringBuilder.toString()
    }
}