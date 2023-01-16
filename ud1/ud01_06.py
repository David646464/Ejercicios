distancia = float(input("Ingresa la distancia del trayecto en km: "))
consumo = float(input("Ingresa el consumo medio del vehiculo cada 100 km: "))
precioConbustible = float(input("Ingresa el precio aproximado del combustible: "))
numeroPasajeros = float(input("Ingresa el número de pasajeros: "))

importeTotal = distancia * consumo / 100 * precioConbustible
importeMedio = importeTotal / distancia
importeIndividual = importeTotal / numeroPasajeros

print("El importe total del trayecto sera ", importeTotal, "€")
print("El importe medio por km sera ", importeMedio, "€")
print("Cada pasajero del vehiculo debera pagar ", importeIndividual, "€")