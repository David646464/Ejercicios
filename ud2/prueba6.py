c0 =int(input("Introduce el número"))
calculo = 0
contador = 0
while c0 != 1:
    if c0%2 == 0:
        c0 //=2
        contador += 1
    else:
       c0 = c0 * 3 + 1
       contador += 1
    print(c0)
print(contador," Pasos")