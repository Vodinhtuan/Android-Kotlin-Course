fun main(args: Array<String>) {
    //println("Hello")
    for(item in 1..10) {
        println("Hello")
    }
    var i = 0
    while(i < 10) {
        println("$i")
        i++
    }

    do{
        println("$i")
        i++
    }while(i <= 10)

    loop@ for(count in 1..10){
        if(count==4){
            //continue
             break@loop
        }
        println("count: $count")

    }
}