#Creador David Sánchez Peso











#ejercicio 20 ud 2

num = int(input("Introduce un número "))
numMayor =num
numMenor=num
while num > 0 :
    if num > numMayor :
        numMayor =num
    if num < numMenor :
        numMenor = num
    num = int(input("Introduce un número"))
print("El número mas grande es ",numMayor,"y el mas pequeño es ",numMenor)