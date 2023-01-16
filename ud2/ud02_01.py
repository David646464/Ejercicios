#Creador: David Sánchez Peso
#Ejercicio número 1 ud 2

#Constantes
DESCUENTO = 5
CUANDO_APLICAR_DESCUENTO = 100

#Entrada de información
precio = float(input("Introduce el precio del producto: "))
numero_unidades = float(input("Introduce la cantidad del producto: "))

#Calculos
precio_sin_iva = precio * numero_unidades
iva = precio_sin_iva / 100 * 21
precio_final = precio_sin_iva + iva

#condicion y salida de información
if precio_final> CUANDO_APLICAR_DESCUENTO:
    print("El coste de la compra será: ",precio_final-(precio_final/100*DESCUENTO),"€")
else:
    print("El coste de la compra será: ",precio_final,"€")

#Fin del código

