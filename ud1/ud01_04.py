velocidad = float(input("Introduce la velocidad "))
velocidadM  = float(input("Introduce la velocidad maxima "))
velocidadMini = (velocidadM / 2)
print(velocidadMini <= velocidad if velocidad else velocidad <= velocidadM)