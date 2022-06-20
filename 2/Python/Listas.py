def listas(list, n):
    for i in range(0, len(list)):
        if n == list[i]:
            print(i + 1)
            return
    print(0)

temp = [1,5,3,5,6,5,3,4] 
print("Ingrese n a buscar en la lista")
listas(temp, int(input()))