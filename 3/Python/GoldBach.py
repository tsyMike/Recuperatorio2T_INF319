def GoldBach():
    for i in range(4,101,2):
        temp = i
        a, b = 0, 0
        while temp > 1:
            esprimo_1 = True
            for j in range(2, temp):
                if temp % j == 0:
                    esprimo_1 = False
                    break
                if esprimo_1:
                    a = temp
                    break
            temp_2 = temp
            while temp_2 > 1:
                esprimo_2 = True
                for k in range(2, temp_2):
                    if temp_2 % k == 0:
                        esprimo_2 = False
                        break
                    if esprimo_2:
                        b = temp_2
                        if a + b == i:
                            print(a, " + ", b, " = ", i)
                            break
                temp_2 -= 1
            temp -= 1
GoldBach()