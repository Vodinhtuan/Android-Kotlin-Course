import java.io.File
import java.io.FileReader
import java.io.FileWriter

fun main (args: Array<String>) {
    print("Enter 1- read or 2- write ")
    val op = readLine()!!.toInt()
    when(op){
        1->{
            ReadFile("test.txt")
        }
        2->{
            print("Write to file text: ")
            var str:String = readLine().toString()
            WriteFile(str)
        }
    }
}

fun WriteFile(str: String) {
    try {
        val fo = FileWriter("test.txt", true)
        fo.write(str +"\n")
        fo.close()
        println("data is saved!")
    }catch (ex: Exception){
        println(ex.message)
    }
}

fun ReadFile(str: String){
    try {
        val fin = FileReader(File(str))
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex: Exception){
        println(ex.message)
    }
}