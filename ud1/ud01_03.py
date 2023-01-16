from lib2to3.pytree import Base
from traceback import print_tb


numeroBase = float(input("Ingresa el numero de la base: "))
numeroAltura = float(input("Ingresa el numero de la altura: "))
area = (numeroAltura * numeroBase) / 2
print("El area del triangulo es: " , area , "u^2")