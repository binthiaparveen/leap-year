import java.util.Scanner
fun main() {
    var sc = Scanner(System.`in`)

    var year:Int = sc.nextInt()


    fun isLeapYear(year: Int): Boolean {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0
            } else {
              return true
            }
        } else {
          return false
        }
    }

    if (isLeapYear(year)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }

}