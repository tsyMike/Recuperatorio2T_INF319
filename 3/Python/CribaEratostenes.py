def eratosEstructurada(x):
    while x > 1:
        esprimo = True
        for i in range(2, x):
            if x % i == 0:
                esprimo = False
                break
            if esprimo:
                print(x)
                break
        x-=1

def eratosReursivo(x):
    esprimo = True
    if x > 1:
        for i in range(2, x):
            if x % i == 0:
                eratosReursivo(x - 1)
                esprimo = False
                break
        if esprimo:
            eratosReursivo(x - 1)
            print(x)
    else:
        return

print("Criba Estructurada:")
eratosEstructurada(int(input()))
print("Criba Recusriva:")
eratosReursivo(int(input()))