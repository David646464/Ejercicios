##Area de constantes
modulo = "Bases de datos"
moduloHoras = 187
numeroDeHoras = moduloHoras * 60 / 50
faltas6Porciento = numeroDeHoras/100 * 6
faltas10Porciento = numeroDeHoras/100 * 10

#Entrada de información
numeroDeHorasFaltadas = float(input("Ingresa el número de horas faltadas por el alumno: "))

#Calculo del porcentaje de las horas saltadas
faltasporcentaje = numeroDeHorasFaltadas * 100 / moduloHoras

#Salida de la información
print("Usted tiene evaluación continua en", modulo , ", usted falto un ",faltasporcentaje,"%") if numeroDeHorasFaltadas < faltas6Porciento else print("Cuidado con perder la evaluación continua, usted supera el 6% d efaltas en ", modulo , ", usted falto un ",faltasporcentaje,"%") if numeroDeHorasFaltadas > faltas6Porciento and numeroDeHorasFaltadas< faltas10Porciento else print("Usted perdio nla evaulación continua por exceder el 10% de faltas en ", modulo , ", usted falto un ",faltasporcentaje,"%")