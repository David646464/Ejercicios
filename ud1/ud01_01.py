# Calcular el IVA
# Entrada de Datos
precioBase = float(input("Introduce la base imponible: "))
iva = int(input("Introduce el % de IVA: "))
 
# Proceso y salida de información por consola
importeIva = (precioBase * iva) / 100
print("El importe del IVA es", importeIva, "€")
 
importeTotal = precioBase + importeIva
print("El importe total es de", importeTotal, "€")