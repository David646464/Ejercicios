#enunciado

print("=======================")
print("Bienvenido al juego de ")
print("    Tres en raya       ")
print("=======================")
print("")
print("=================================================================================================================================================")
print("|Explicación del uso del programa:                                                                                                              |")
print("|Tu como jugador tienes que seleccionar un cuadrante en el cual tu quieres marcar.La disposición de los cuadrantes es:                          |")
print("|1 2 3                                                                                                                                          |")
print("|4 5 6                                                                                                                                          |")
print("|7 8 9                                                                                                                                          |")
print("|Despues de eligir tu cuadrante seleccionas que marca quieres poner (X o 0) para ello la X se selecciona escribiendo 1 y para poner 0 escribes 2|")
print("=================================================================================================================================================")




#La cuadricula
#Variables
a=0
b=0
c=0
d=0
e=0
f=0
g=0
h=0
i=0

#Bucle
while a!=b!=c or d!=e!=f or g!=h!=i or a!=d!=g or b!=e!=h or c!=f!=i or a!=e!=i or c!=e!=g:
    #Fila 1
    #cuadricula a
    print("--------- ","--------- ","--------- ")
    print("| \  /  | " if a == 1 else "| /---\ | " if a ==2 else "|       | ","| \  /  | " if b == 1 else "| /---\ | " if b ==2 else "|       | ","| \  /  | " if c == 1 else "| /---\ | " if c ==2 else "|       | " )
    print("|  \/   | " if a == 1 else "| |   | | " if a ==2 else "|       | ","|  \/   | " if b == 1 else "| |   | | " if b ==2 else "|       | ","|  \/   | " if c == 1 else "| |   | | " if c ==2 else "|       | " )
    print("|  /\   | " if a == 1 else "| |   | | " if a ==2 else "|       | ","|  /\   | " if b == 1 else "| |   | | " if b ==2 else "|       | ","|  /\   | " if c == 1 else "| |   | | " if c ==2 else "|       | " )
    print("| /  \  | " if a == 1 else "| \---/ | " if a ==2 else "|       | ","| /  \  | " if b == 1 else "| \---/ | " if b ==2 else "|       | ","| /  \  | " if c == 1 else "| \---/ | " if c ==2 else "|       | " )
    print("--------- ","--------- ","--------- ")

    #Fila 2
    #cuadricula d
    print("--------- ","--------- ","--------- ")
    print("| \  /  | " if d == 1 else "| /---\ | " if d ==2 else "|       | ","| \  /  | " if e == 1 else "| /---\ | " if e ==2 else "|       | ","| \  /  | " if f == 1 else "| /---\ | " if f ==2 else "|       | " )
    print("|  \/   | " if d == 1 else "| |   | | " if d ==2 else "|       | ","|  \/   | " if e == 1 else "| |   | | " if e ==2 else "|       | ","|  \/   | " if f == 1 else "| |   | | " if f ==2 else "|       | " )
    print("|  /\   | " if d == 1 else "| |   | | " if d ==2 else "|       | ","|  /\   | " if e == 1 else "| |   | | " if e ==2 else "|       | ","|  /\   | " if f == 1 else "| |   | | " if f ==2 else "|       | " )
    print("| /  \  | " if d == 1 else "| \---/ | " if d ==2 else "|       | ","| /  \  | " if e == 1 else "| \---/ | " if e ==2 else "|       | ","| /  \  | " if f == 1 else "| \---/ | " if f ==2 else "|       | " )
    print("--------- ","--------- ","--------- ")

    #Fila 3
    #cuadricula g
    print("--------- ","--------- ","--------- ")
    print("| \  /  | " if g == 1 else "| /---\ | " if g ==2 else "|       | ","| \  /  | " if h == 1 else "| /---\ | " if h ==2 else "|       | ","| \  /  | " if i == 1 else "| /---\ | " if i ==2 else "|       | " )
    print("|  \/   | " if g == 1 else "| |   | | " if g ==2 else "|       | ","|  \/   | " if h == 1 else "| |   | | " if h ==2 else "|       | ","|  \/   | " if i == 1 else "| |   | | " if i ==2 else "|       | " )
    print("|  /\   | " if g == 1 else "| |   | | " if g ==2 else "|       | ","|  /\   | " if h == 1 else "| |   | | " if h ==2 else "|       | ","|  /\   | " if i == 1 else "| |   | | " if i ==2 else "|       | " )
    print("| /  \  | " if g == 1 else "| \---/ | " if g ==2 else "|       | ","| /  \  | " if h == 1 else "| \---/ | " if h ==2 else "|       | ","| /  \  | " if i == 1 else "| \---/ | " if i ==2 else "|       | " )
    print("--------- ","--------- ","--------- ")

    if a==b==c!=0 or d==e==f!=0 or g==h==i!=0 or a==d==g!=0 or b==e==h!=0 or c==f==i!=0 or a==e==i!=0 or c==e==g!=0 :
        break

    print("===================================================================================================") 
    cuadrante =int(input("Escribe el cuadrante en el cual quieres colocar tu marca: "))
    tipo_de_marca = int(input("Para colocar una X en el cuadrante selecionado escribe 1 y en caso de querer colocar 0 escribe 2: "))
    print("===================================================================================================") 

    if cuadrante == 1:
        if tipo_de_marca == 1:
            a = 1
        else:
            a = 2
    elif cuadrante == 2:
        if tipo_de_marca == 1:
            b = 1
        else:
            b = 2
    elif cuadrante == 3:
        if tipo_de_marca == 1:
            c = 1
        else:
            c = 2
    elif cuadrante == 4:
        if tipo_de_marca == 1:
            d = 1
        else:
            d = 2
    elif cuadrante == 5:
        if tipo_de_marca == 1:
            e = 1
        else:
            e = 2
    elif cuadrante == 6:
        if tipo_de_marca == 1:
            f = 1
        else:
            f = 2
    elif cuadrante == 7:
        if tipo_de_marca == 1:
            g = 1
        else:
            g = 2
    elif cuadrante == 8:
        if tipo_de_marca == 1:
            h = 1
        else:
            h = 2
    elif cuadrante == 9:
        if tipo_de_marca == 1:
            i = 1
        else:
            i = 2
    else:
        print("No se introdujo bien los datos")


if a==b==c==1 or d==e==f==1 or g==h==i==1 or a==d==g==1 or b==e==h==1 or c==f==i==1 or a==e==i==1 or c==e==g==1:
    print("El ganador es la x")
elif a==b==c==2 or d==e==f==2 or g==h==i==2 or a==d==g==2 or b==e==h==2 or c==f==i==2 or a==e==i==2 or c==e==g==2:
    print("El ganador es el 0")
else:
    print("Empate")


