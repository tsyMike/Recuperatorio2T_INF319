object Criba {
    def eratosEstructurado(n:Int):Int = {
       while (x > 1){
            var esprimo = True;
            for (i <- 2 to x){
                if (x % i == 0){
                    esprimo = False;
                    i <- x + 1;
                }
                if (esprimo){
                    print(x);
                    i <- x + 1;
                }
            }
            x <- x - 1;
        }
    }
    
    def eratosRecursivo(n:Int):Int = {
        esprimo = True
        if(x > 1){
            for (i <- 2 to x){
                if x % i == 0 {
                    eratosReursivo(x - 1);
                    esprimo = False;
                    i <- x + 1;
                }
            }
            if (esprimo){
                eratosReursivo(x - 1);
                println(x);
            }
        }
        else {
            return;
        }
    }
    def main(args: Array[String]):Unit = {
        println("Criba Estructurada: ");
        val temp = scala.io.StdIn.readInt();
        eratosEstructurado(temp);
        println("Criba Recursiva: ");
        temp = scala.io.StdIn.readInt();
        eratosRecursivo(temp);
    }   
}