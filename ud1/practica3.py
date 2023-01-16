#Area de constantes
#Cantidad por persona
cantManzana1 = 250 #gramos
cantAgua1 = 55 #ml
cantAzucar1 = 20#gramos
cantLimon1 = 1 #Suponemos que para cualquier número de personas es una cucharadita de limon

#Precio en € por Kg
precManzana = 1.99
preAzucar = 0.87

#Salida de información inicial
print ("Receta de compota de manzana casera")
print ("La URL es: https://www.recetasderechupete.com/compota-de-manzana-casera/12509/")
print ("Esta receta etsa pensada para 6 personas y se precisa: 1Kg de manzanas, 330ml de agua, 120g de azúcar blanco y una cucharilla de limón")
print ("Opcionalmente puedes añadir rarradura de piel de naranja y una ramita de canela")

#Entrada de información
numeroPersonas = float(input("Introduce el numero de personas para adaptar al número de comensales: "))

#Calculos:

#Calculo de las cantidades
cantManzanaAdaptada = cantManzana1 * numeroPersonas
cantAzucarAdaptada = cantAzucar1 * numeroPersonas
cantAguaAdaptada = cantAgua1 * numeroPersonas

#Calculo del precio
precManzanaFinal = cantManzanaAdaptada/1000*precManzana
preAzucarFinal = cantAzucarAdaptada/1000*preAzucar

#Salida de la información
print("Las cantidades adaptadas para ", numeroPersonas , " personas son: ")
print(cantManzanaAdaptada," gramos de manzanas ", cantAguaAdaptada, " mililitros de agua ", cantAzucarAdaptada, " gramos de azucar y una cucharadita de limón")
print("El precio de las manzanas será ", round(precManzanaFinal,2),"€ y el precio del azucar será ", round(preAzucarFinal,2),"€" )
print("Es aconsejable reducir la cantidad de azúcar lo maximo posible para el bienestar de nuestra salud")