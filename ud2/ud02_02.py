#creador:David Sánchez Peso

#Ejecicio 2 ud2

#Entrada de información
print("Introduce tres números diferentes") 
numero1 = int(input("Introduce el número 1"))
numero2 = int(input("Introduce el número 2"))
numero3 = int(input("Introduce el número 3"))

#Salida de información
if numero1==numero2==numero3 or numero1==numero2 or numero1==numero3 or numero2==numero3:
    print("Has introducidos números iguales")


if numero1 > numero2 and numero1>numero3:
    print(numero1)
    if numero2 > numero3:
        print(numero2)
        print(numero3)
    else:
        print(numero3)
        print(numero2)


if numero2 > numero2 and numero2>numero3:
    print(numero2)
    if numero1 > numero3:
        print(numero1)
        print(numero3)
    else:
        print(numero3)
        print(numero1)

if numero3 > numero2 and numero3>numero1:
    print(numero3)
    if numero2 > numero1:
        print(numero2)
        print(numero1)
    else:
        print(numero1)
        print(numero2)
