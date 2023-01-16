cantidadInfantil = float(input("Ingresa el número de entradas infantiles "))
cantidadAdulto = float(input("Ingresa el número de entradas de adultos "))
precioTotal = (15.50* cantidadInfantil) + (20.00 * cantidadAdulto)
precioTotal = precioTotal - (precioTotal * 0.05) if precioTotal >= 100 else precioTotal
print(precioTotal)