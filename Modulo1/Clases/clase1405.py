"""
1.Escribir un programa que solicite un valor entero al usuario y determine si
es positivo o negativo; además calcular el valor absoluto del mismo.
"""
num = float(input('Digite numero: '))
if num >= 0:
    print('El numero es positivo.\nEl valor absoluto es: ', num, '\n')
else:
    print('El numero es negativo.\nEl valor absoluto es: ', -1*num, '\n')
"""
3.Un año es bisiesto si:
es divisible por 4 y no es por 100, o si es divisible por 400.
Construir un programa que lea un año y devuelva si es bisiesto o no.
"""
year = int(input('Digite el año: '))
if (year % 4 == 0) and (year % 100 != 0) or (year % 400 == 0):
    print('El año es bisiesto')
else:
    print("El año no es bisiesto")
