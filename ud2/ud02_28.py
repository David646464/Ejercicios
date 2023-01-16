#Creador David Sánchez Peso

#ejercicio 28 ud 2
num = int(input("Introduce un número:  "))



centenas=int((num%1000 - num%100) /100)
decenas = int((num%100 - num%10) / 10)
undidades = num%10

print(undidades,decenas,centenas)