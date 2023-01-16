#Creador David Sánchez Peso

#ejercicio 8 ud 2

#Entrada de la información
print("Introduce un número del 0 al 9999: ")
numero=int(input(""))


#Inspección del número
numero_primer_digito = numero//1000
numero_segundo_digito = numero%1000//100
numero_tercer_digito = numero%100//10
numero_cuarto_digito = numero%10



if numero_primer_digito == numero_cuarto_digito and numero_segundo_digito == numero_tercer_digito:
    print("El número es capicua")
elif numero_primer_digito==0:
        if numero_segundo_digito==numero_cuarto_digito:
            print("El número es capicua")
        else:
            if numero_segundo_digito==0:
                if numero_tercer_digito==numero_cuarto_digito:
                    print("El número es capicua")
                else:
                    if numero_tercer_digito==0:
                        print("El número es capicua")
                    else:
                        print("El número no es capicua")
else:
    print("El número no es capicua")




    





