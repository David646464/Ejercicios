secret_number = 777
#Texto sacado del ejercicio
print(
"""
+==================================+
| ¡Bienvenido a mi juego, muggle!  |
| Introduce un número entero       |
| y adivina qué número he          |
| elegido para ti.                 |
| Entonces,                        |
| ¿Cuál es el número secreto?      |
+==================================+
""")
#Entrada de información
numero_jugador = int(input())

#Inicio del bucle
while numero_jugador != secret_number:
    print("")
    print("¡Ja, ja! ¡Estás atrapado en mi bucle!")
    print("")
    numero_jugador = int(input("Introduce el número que creas que es el número secreto: "))
#Salida del bucle

#salida de información
print("")
print("Muy bien encontraste en número secreto")