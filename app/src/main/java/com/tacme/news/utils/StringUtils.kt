package com.tacme.news.utils

/**
 * Created by Murad Adnan on 2020-01-27.
 */
object StringUtils {
//    fun arabicToDecimal(number: String): String {
//        val chars = CharArray(number.length)
//        for (i in 0 until number.length) {
//            var ch = number[i]
//            if (ch.toInt() >= 0x0660 && ch.toInt() <= 0x0669) (ch -= (0x0660 - '0'.toInt()).toChar()).toChar() else if (ch.toInt() >= 0x06f0 && ch.toInt() <= 0x06F9) (ch -= (0x06f0 - '0'.toInt()).toChar()).toChar()
//            chars[i] = ch
//        }
//        return String(chars)
//    }

    fun isProbablyArabic(s: String): Boolean {
        var i = 0
        while (i < s.length) {
            val c = s.codePointAt(i)
            if (c >= 0x0600 && c <= 0x06E0) return true
            i += Character.charCount(c)
        }
        return false
    }
}