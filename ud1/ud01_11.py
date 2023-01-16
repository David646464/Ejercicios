tiempo = int(input("Introduce el tiempo en segundos: "))
tiempoHoras = tiempo // 3600
tiempoMinutos = (tiempo%3600)// 60
tiempoSegundos = ((tiempo%3600)%60)
print("Los segundos introducidos son ", tiempoHoras , "horas ", tiempoMinutos , "minutos y ", tiempoSegundos , "segundos")

