#creador:David Sánchez Peso

#Ejecicio 6 ud2

#Entrada de información
aforo=int(input("Introduce el aforo maximo: "))
entradas=int(input("Introduce las entradas vendidas: "))
precio=int(input("Introduce el precio de las entradas: "))

#Salida de la información 
if entradas<aforo/2 and entradas > aforo / 5:
    print("las ganacias son: ",entradas* precio -(entradas*precio)/100*25)
else:
    if entradas < aforo / 5:
        print("No hubo ganancias ya que se cancelo el concierto")
    else:
        print("las ganacias son: ",entradas* precio)
