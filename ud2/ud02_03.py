#creador:David Sánchez Peso

#Ejecicio 3 ud2

#Entrada de información
from math import trunc


numero1 =float(input("Introduce el coeficiente de  x²"))
numero2 =float(input("Introduce el coeficiente de  x"))
numero3 =float(input("Introduce el termino idenpediente"))

#Calculos
calculo1 = (-numero2+(numero2*numero2 - 4 * numero1*numero3)**(1/2))/2*numero1
calculo2 = (-numero2-(numero2*numero2 - 4 * numero1*numero3)**(1/2))/2*numero1
calculo_raiz = numero2**2 - 4 * numero1*numero3

#Salida de información
print(calculo_raiz)
if calculo_raiz>=0:
    print("Las soluciones reales son:")
    print(calculo1)
    print(calculo2)
else:
    print("No hay solución")
