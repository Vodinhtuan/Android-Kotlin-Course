fun main(args: Array<String>) {
    //var n:Int=9
    //println(n>=0 && n<=10)

    //var n2:Int=55
    //println(n2==10 || n2>=5)

    //var IsMerried:Boolean=true
    //println(!IsMerried)

    /*println("Enter your grade: ")
    var grade = readLine()!!.toInt()*/
    var x=10;
    when(x){
        1,5-> {
            print("x is 1")
        }
        2-> print("x is 2")
        3-> print("x is 3")
        in 4..10->{
            print("x is in 4..10")
        }
        !in 1..10->{
            print("x is not in 1..10")
        }
        else-> {
            print("value is out of range")
        }
    }
}