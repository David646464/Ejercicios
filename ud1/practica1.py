#Area de constantes
modulo = "Programación"
moduloHoras = 240
minutosPorSesion = 50
numeroDeHoras = moduloHoras * 60 / minutosPorSesion
faltas6Porciento = numeroDeHoras/100 * 6
faltas10Porciento = numeroDeHoras/100 * 10

#Entrada de información
numeroDeHorasFaltadas = float(input("Ingresa el número de horas faltadas por el alumno: "))

#Calculo del porcentaje de las horas saltadas
faltasporcentaje = numeroDeHorasFaltadas * 100 / numeroDeHoras

#Salida de la información
print("Usted tiene evaluación continua en", modulo , ", usted falto un ",faltasporcentaje,"%") if numeroDeHorasFaltadas < faltas6Porciento else print("Cuidado con perder la evaluación continua, usted supera el 6% de las faltas en ", modulo , ", usted falto un ",faltasporcentaje,"%") if numeroDeHorasFaltadas > faltas6Porciento and numeroDeHorasFaltadas< faltas10Porciento else print("Usted perdio la evaulación continua por exceder el 10% de las faltas en ", modulo , ", usted falto un ",faltasporcentaje,"%")