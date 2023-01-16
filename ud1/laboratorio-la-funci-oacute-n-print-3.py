hour = int(input("Hora de inicio (horas): "))
mins = int(input("Minuto de inicio (minutos): "))
dura = int(input("Duración del evento (minutos): "))
minutos = mins + dura
print ("la hora final es " , ((hour + (minutos // 60)))   , "y " , minutos % 60 )


