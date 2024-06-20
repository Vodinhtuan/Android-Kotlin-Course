fun main(args: Array<String>) {
    var n1=10
    var n2=20
    var max= if(n1>n2)n1 else n1
    println("max: $max")
    var age=30
    var isYoung=when(age){
        in 30..40-> true
        else->false
    }
}