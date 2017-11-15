package lesson5.task1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test

class Tests {
    @Test
    @Tag("Example")
    fun timeStrToSeconds() {
        assertEquals(36000, timeStrToSeconds("10:00:00"))
        assertEquals(41685, timeStrToSeconds("11:34:45"))
        assertEquals(86399, timeStrToSeconds("23:59:59"))
    }

    @Test
    @Tag("Example")
    fun twoDigitStr() {
        assertEquals("00", twoDigitStr(0))
        assertEquals("09", twoDigitStr(9))
        assertEquals("10", twoDigitStr(10))
        assertEquals("99", twoDigitStr(99))
    }

    @Test
    @Tag("Example")
    fun timeSecondsToStr() {
        assertEquals("10:00:00", timeSecondsToStr(36000))
        assertEquals("11:34:45", timeSecondsToStr(41685))
        assertEquals("23:59:59", timeSecondsToStr(86399))
    }

    @Test
    @Tag("Normal")
    fun dateStrToDigit() {
        assertEquals("15.07.2016", dateStrToDigit("15 июля 2016"))
        assertEquals("", dateStrToDigit("3 мартобря 1918"))
        assertEquals("18.11.2018", dateStrToDigit("18 ноября 2018"))
        assertEquals("", dateStrToDigit("23"))
        assertEquals("03.04.2011", dateStrToDigit("3 апреля 2011"))
    }

    @Test
    @Tag("Normal")
    fun dateDigitToStr() {
        assertEquals("15 июля 2016", dateDigitToStr("15.07.2016"))
        assertEquals("", dateDigitToStr("01.02.20.19"))
        assertEquals("", dateDigitToStr("28.00.2000"))
        assertEquals("3 апреля 2011", dateDigitToStr("03.04.2011"))
        assertEquals("", dateDigitToStr("ab.cd.ef"))
    }

    @Test
    @Tag("Normal")
    fun flattenPhoneNumber() {
        assertEquals("+79211234567", flattenPhoneNumber("+7 (921) 123-45-67"))
        assertEquals("123456798", flattenPhoneNumber("12 --  34- 5 -- 67 -98"))
        assertEquals("", flattenPhoneNumber("ab-123"))
        assertEquals("+12345", flattenPhoneNumber("+12 (3) 4-5"))
        assertEquals("", flattenPhoneNumber("134_+874"))
    }

    @Test
    @Tag("Normal")
    fun bestLongJump() {
        assertEquals(-1, bestLongJump("706 %%- - 717 - 703"))
        assertEquals(-1, bestLongJump("% - - % -"))
        assertEquals(754, bestLongJump("700 717 707 % 754"))
        assertEquals(-1, bestLongJump("700 + 700"))

    }

    @Test
    @Tag("Hard")
    fun bestHighJump() {
        assertEquals(226, bestHighJump("226 +"))
        assertEquals(-1, bestHighJump("???"))
        assertEquals(230, bestHighJump("220 + 224 %+ 228 %- 230 + 232 %%- 234 %"))
        assertEquals(990521615, bestHighJump("820993292 %%- 147483648 + 907538027 %%- 1 %- 947315793 + 147483647 %- 710333693 + 7169136 + 0 %%- 478670180 %%- 147483648 %%- 44217374 %- 147483647 + 0 %- 831905539 %%+ 848564284 %+ 1 %- 147483648 %+ 425330099 %+ 0 %%- 147483648 %%+ 720244147 %- 4038542 %+ 1 %- 147483647 %- 147483648 + 147483647 + 147483647 + 0 %%+ 42819331 + 0 + 970729122 + 147483647 + 786435390 %+ 147483647 %- 0 %%- 141684428 + 147483647 + 0 %%- 217511412 + 147483647 %%- 657497697 + 160522884 %%- 1 %+ 504922376 %- 147483647 + 467500638 %- 975622325 + 1 %%- 418982230 %%- 147483647 + 602120184 %%- 147483647 %- 460734906 + 990521615 %+ 0 %%+ 0 %+ 147483648 + 290349810 %+ 1 %- 1 + 1 %- 82372337 %%- 147483647 + 147483648 %- 240750655 %%+ 609607769 + 970002941 %%- 912638302 %- 1 %+ 147483648 %%- 147483648 %+ 1 + 89479474 %%- 147483647 %%- 1 %%- 32197745 %%+ 147483647 %+ 841971605 + 455930152 %+ 557254271 %%- 942767524 %%+ 924353517 %%- 195703909 %%- 1 %+ 147483647 %%- 147483648 %- 596210202 %+"))
    }

    @Test
    @Tag("Hard")
    fun plusMinus() {
        assertEquals(0, plusMinus("0"))
        assertEquals(4, plusMinus("2 + 2"))
        assertEquals(6, plusMinus("2 + 31 - 40 + 13"))
        assertEquals(-1, plusMinus("0 - 1"))
    }

    @Test
    @Tag("Hard")
    fun firstDuplicateIndex() {
        assertEquals(-1, firstDuplicateIndex("Привет"))
        assertEquals(9, firstDuplicateIndex("Он пошёл в в школу"))
        assertEquals(40, firstDuplicateIndex("Яблоко упало на ветку с ветки оно упало на на землю"))
        assertEquals(9, firstDuplicateIndex("Мы пошли прямо Прямо располагался магазин"))
    }

    @Test
    @Tag("Hard")
    fun mostExpensive() {
        assertEquals("", mostExpensive(""))
        assertEquals("Курица", mostExpensive("Хлеб 39.9; Молоко 62.5; Курица 184.0; Конфеты 89.9"))
        assertEquals("Вино", mostExpensive("Вино 255.0"))
        assertEquals("0^4n6nUH'GDJ|!N/)og]H^:>*,K<\$*", mostExpensive("9 8681467.79; d6,:<% 0; kNVp\\\"M.([H@J. 0.01; 0^4n6nUH'GDJ|!N/)og]H^:>*,K<$* 21474836.47; c$%`+*n=HX$/%:1SOny!144\\\"W9O%3.6/^=FmEirMZw|%vwLIBJC7<SVi#+v~l]<%@PKSCh}r<rBGvC%FXX1QvC1Q/%UnmpWK=o%p_**C\$3mZccM.ml~B9F?y:t0U3z\\\\Qw#*u\\\"^T=#SC%a(%.8U%>Z{U\$-nq!eX_!id[(r.#cqF\\\"{h%]o8))<67q)4W15*'\\\\h.NOfUc:e]Ea{nDU~%L%zsMzsX[!\\\\%>vF?/M7c 2094137.72; q?z\\\"6&AwK%\\\"_5Fa8k.6T 0; U6A,4<sZKC 21474836.47; T#c 21474836.47; ArCQ`g]h>>w>%wC|:@!uP02~/U\\\"9rFD_?fgZ{UFP>0F5IBIkVl<?wlv*0Y%R&Fx\$?nHt]7'Ez^?p4a3~Z3sx,P^B_Nu){>B'l-_>9+Y/hFMu 0.01; 65%B:a{BQ%2V:8IFx*ZK2s[:%jiNCS%\\\"%#jawpC)?\\\\?%Mz8K& 21474836.47; ` 0.01; 0 21474836.47; { 0.01; L,SPu 0"))
    }

    @Test
    @Tag("Hard")
    fun fromRoman() {
        assertEquals(1, fromRoman("I"))
        assertEquals(3000, fromRoman("MMM"))
        assertEquals(1978, fromRoman("MCMLXXVIII"))
        assertEquals(694, fromRoman("DCXCIV"))
        assertEquals(49, fromRoman("XLIX"))
        assertEquals(-1, fromRoman("Z"))
    }

    @Test
    @Tag("Impossible")
    fun computeDeviceCells() {
        assertEquals(listOf(0, 0, 0, 0, 0, 1, 1, 1, 1, 1), computeDeviceCells(10, "+>+>+>+>+", 10000))
        assertEquals(listOf(-1, -1, -1, -1, -1, 0, 0, 0, 0, 0), computeDeviceCells(10, "<-<-<-<-<-", 10000))
        assertEquals(listOf(1, 1, 1, 1, 1, 0, 0, 0, 0, 0), computeDeviceCells(10, "- <<<<< +[>+]", 10000))
        assertEquals(listOf(0, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0),
                computeDeviceCells(11, "<<<<< + >>>>>>>>>> --[<-] >+[>+] >++[--< <[<] >+[>+] >++]", 10000))

        assertEquals(listOf(0, 0, 0, 0, 0, 1, 1, 0, 0, 0), computeDeviceCells(10, "+>+>+>+>+", 4))
        assertEquals(listOf(0, 0, -1, -1, -1, 0, 0, 0, 0, 0), computeDeviceCells(10, "<-<-<-<-<-", 6))
        assertEquals(listOf(1, 1, 1, 0, 0, -1, 0, 0, 0, 0), computeDeviceCells(10, "- <<<<< +[>+]", 17))
        assertEquals(listOf(0, 6, 5, 4, 3, 2, 1, 0, -1, -1, -2),
                computeDeviceCells(11, "<<<<< + >>>>>>>>>> --[<-] >+[>+] >++[--< <[<] >+[>+] >++]", 256))
    }
}