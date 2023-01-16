numero_bloques =int(input("Introduce el número de bloques"))
altura =0

while altura < numero_bloques:
    altura += 1
    numero_bloques -=altura
print("la altura es de ",altura,)
if numero_bloques>0:
    print("han sobrado ",numero_bloques," porque no daban para un piso mas")