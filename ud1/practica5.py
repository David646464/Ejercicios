#Costantes:
notaFinal = 0

#Programa funciona?
progFuncionaSi = 4
progFuncionaSiPeroNoComoDebe = 2
progFuncionaNo = 0

#El programa funciona eficiente?
progFuncionaEficienteSi = 1
progFuncionaEficienteRegular = 0.5
progFuncionaEficienteNo = 0

#Usa estructuras y tipos de datos?
usaEstrucSiempre = 1
usaEstrucAVeces = 0.5
usaEstrucNunca = 0
#Usa identificadores adecuados?
usaIdentificadoresSiempre = 1.5
usaIdentificadoresAVeces = 0.75
usaIdentificadoresNunca = 0

#El programa es legible?
progLegibleMucho = 1.5
progLegibleRegular = 0.75
progLegiblePoco = 0

#Presenta la información completa al usuario?
presCompletaSi = 1
presCompletaRegular = 0.5
presCompletaNo = 0

#Entrega correcta
entregaCorrectaSi = 0
entregaCorrectaNoFormato = -1
entregaCorrectaSinEntrega = 0

progFuncionaNota = float(input("El programa funciona?.Para indicar la puntuación escribe '4' para 4 puntos , '2' para 2 puntos y '0' para 0 puntos"))
notaFinal = notaFinal + progFuncionaSi if progFuncionaNota == progFuncionaSi else notaFinal + progFuncionaSiPeroNoComoDebe if progFuncionaNota == progFuncionaSiPeroNoComoDebe  else notaFinal + progFuncionaNo

progFuncionaEficienteNota = input("El programa funciona eficiente?.Para indicar la puntuación escribe '1' para 1 puntos , '0.5' para 0.5 puntos y '0' para 0 puntos")
notaFinal = notaFinal + progFuncionaEficienteSi if progFuncionaNota == progFuncionaEficienteNota else notaFinal + progFuncionaEficienteRegular if progFuncionaEficienteNota == progFuncionaEficienteRegular  else notaFinal + progFuncionaEficienteNo

usaEstrucNota =  input("Usa estructuras y tipos de datos?.Para indicar la puntuación escribe '1' para 1 puntos , '0.5' para 0.5 puntos y '0' para 0 puntos")
notaFinal = notaFinal + usaEstrucSiempre if usaEstrucNota == usaEstrucSiempre else notaFinal + usaEstrucAVeces if usaEstrucNota == usaEstrucAVeces  else notaFinal + usaEstrucNunca

usaIdentificadoresNota = input("Usa identificadores adecuados?.Para indicar la puntuación escribe '1.5' para 1.5 puntos , 'a veces' para 0.75 puntos y '0' para 0 puntos")
notaFinal = notaFinal + progFuncionaSi if progFuncionaNota == progFuncionaSi else notaFinal + progFuncionaSiPeroNoComoDebe if progFuncionaNota == progFuncionaSiPeroNoComoDebe  else notaFinal + progFuncionaNo

progLegibleNota = input("El programa es legible?.Para indicar la puntuación escribe '1.5' para 1.5 puntos , '0.75' para 0.75 puntos y '0' para 0 puntos")
notaFinal = notaFinal + progFuncionaSi if progFuncionaNota == progFuncionaSi else notaFinal + progFuncionaSiPeroNoComoDebe if progFuncionaNota == progFuncionaSiPeroNoComoDebe  else notaFinal + progFuncionaNo

presCompletaNota = input("Presenta la información completa al usuario?.Para indicar la puntuación escribe '1' para 1 puntos , '0.5' para 0.5 puntos y '0' para 0 puntos")
notaFinal = notaFinal + progFuncionaSi if progFuncionaNota == progFuncionaSi else notaFinal + progFuncionaSiPeroNoComoDebe if progFuncionaNota == progFuncionaSiPeroNoComoDebe  else notaFinal + progFuncionaNo

entregaCorrectaNota = input("Entrega correcta.Para indicar la puntuación escribe '0' no modificar la puntuación , '1' para restar 1 punto y '2' para puntuar con un 0")
notaFinal = notaFinal + progFuncionaSi if progFuncionaNota == progFuncionaSi else notaFinal + progFuncionaSiPeroNoComoDebe if progFuncionaNota == progFuncionaSiPeroNoComoDebe  else notaFinal + progFuncionaNo