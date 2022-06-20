object GoldBach {
    def GoldBach() {
        for (i <- 4 to 101) {
            i = i + 1;
            temp = i;
            a = 0;
            b = 0;
            while (temp > 1) {
                esprimo_1 = True;
                for (j <- 2 to temp) {
                    if (temp % j == 0) { 
                        esprimo_1 = False;
                        break;
                    }
                    if (esprimo_1) {
                        a = temp;
                        break;
                    }
                }
                temp_2 = temp; 
                
                while (temp_2 > 1) {
                    esprimo_2 = True;
                    for (k <- 2 totemp_2) {
                        if temp_2 % k == 0 {
                            esprimo_2 = False;
                            break;
                        }
                        if (esprimo_2) {
                            b = temp_2;
                            if (a + b == i) {
                                print(a, " + ", b, " = ", i);
                                break;
                            }
                        }
                    }
                    temp_2 -= 1
                }
                temp -= 1
            }
        }
    }
    def main(args: Array[String]):Unit = {
        GoldBach()
    }
}