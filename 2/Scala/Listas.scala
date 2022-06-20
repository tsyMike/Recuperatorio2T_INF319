object Listas {
    def listas(list: Int*, n:Int): Unit{
        for i in range(0, len(list)){
            if n == list(i){
                println(i + 1)
                return
            }
        }
        println(0)
    }

    def main(args: Array[String]):Unit = {
        println("[1,5,3,5,6,5,3,4]")
        var z = Array(1,5,3,5,6,5,3,4)
        println("Ingrese n abuscar en la lista: ")
        var temp = scala.io.StdIn.readInt()
        Listas(z, temp)
    } 
}