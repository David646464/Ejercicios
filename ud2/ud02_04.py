#creador:David Sánchez Peso

#Ejecicio 4 ud2

#Entrada de información
numero=int(input("Introduce en número sin decimales entre el 0 y el 99999 "))

#Salida de información
if numero <= 9:
    print("El número tien 1 cifra")
elif numero <= 99:
    print("El número tien 2 cifras")
elif numero <= 999:
    print("El número tien 3 cifras")
elif numero <= 9999:
    print("El número tien 4 cifras")
elif numero <= 99999:   
    print("El número tien 5 cifras")
elif numero>99999:
    print("No seguistes las indicaciones del inicio")


