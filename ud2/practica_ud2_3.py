# Imprime la palabra que se muestra al usuario con guiones
# o letras según las letras ya utilizadas
def obtienePalabrraUsuario(palabra, letras):
    palabraUsuario = ""
    for letra in palabra:
        if letra in letras:
            palabraUsuario += letra
        else:
            palabraUsuario += "-"
    return palabraUsuario


# Imprime el dibujo según el número de fallos
def imprimeAhorcado(fallos):
    print("Número de fallos: ",numFallos)
    if fallos == 0:
        print("Fallos = 0")
        print("  ____")
        print(" |    |")
        print("      |")
        print("      |")
        print("      |")
        print("      |")
        print("      |")
        print("______|")
elif fallos == 1:
    print("Fallos = 1")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("      |")
    print("      |")
    print("      |")
    print("      |")
    print("______|")
elif fallos == 2:
    print("Fallos = 2")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print(" |    |")
    print("      |")
    print("      |")
    print("      |")
    print("______|")
elif fallos == 3:
    print("Fallos = 3")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("/|    |")
    print("      |")
    print("      |")
    print("      |")
    print("______|")
elif fallos == 4:
    print("Fallos = 4")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("/|\   |")
    print("      |")
    print("      |")
    print("      |")
    print("______|")
elif fallos == 5:
    print("Fallos = 5")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("/|\   |")
    print(" |    |")
    print("      |")
    print("      |")
    print("______|")
elif fallos == 6:
    print("Fallos = 6")
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("/|\   |")
    print(" |    |")
    print("/     |")
    print("      |")
    print("______|")
elif fallos == 7:
    print("  ____")
    print(" |    |")
    print(" O    |")
    print("/|\   |")
    print(" |    |")
    print("/ \   |")
    print("      |")
    print("______|")

# Programa principal
palabraOculta = "murcielago"
palabraUsuario = ""
letrasUsuario = ""
numFallos = 0
maxFallos = 7

palabraUsuario = obtienePalabrraUsuario(palabraOculta, letrasUsuario)
print(palabraUsuario)

while numFallos < maxFallos and palabraOculta != palabraUsuario:
    letraActual = input("Escribe una letra: ")
    letrasUsuario += letraActual
    if letraActual in palabraOculta:
        obtienePalabrraUsuario(palabraOculta, letrasUsuario)
    else:
        numFallos += 1
        imprimeAhorcado(numFallos)

if numFallos == maxFallos:
    print("DERROTA...")
else:
    print("¡VICTORIA!")