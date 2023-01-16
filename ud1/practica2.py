#area de constantes
campoFutbol = 105 * 70 
campoBaloncesto = 28 * 15
campoTenis = 23.77 * 10.97
campoRetiro = 1250000

#Entrada de datos
hectareas = float(input("Inttroduce el númro de hectáreas afectadas: "))

#Calculos
hectareasEnMetros = hectareas* 10000

#salida de la información
print("El área afectada equivale a:")
print( hectareasEnMetros//campoFutbol ,"campos de fútbol")
print( hectareasEnMetros//campoBaloncesto ,"campos de baloncesto")
print( hectareasEnMetros//campoTenis ,"campos de tenis")
print( hectareasEnMetros//campoRetiro ,"Parques de Retiro")
