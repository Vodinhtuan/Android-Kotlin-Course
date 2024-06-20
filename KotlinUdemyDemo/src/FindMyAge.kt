import java.util.*

fun main(args: Array<String>) {
    // input
    print("Enter your DOB: ")
    var DOB:Int= readln()!!.toInt()

    // process
    var year= Calendar.getInstance().get(Calendar.YEAR)
    var age:Int?
    age=year-DOB
    // output
    println("Your age is $age years old")
}