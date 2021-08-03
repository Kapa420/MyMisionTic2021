"""CLase 12/05/2021.
1. Leer 3 numeros, calcular e imprimir el mayor.
2. Leer un numero positivo y determinar si es par o impar
"""
# 1. Leer 3 numeros
num1 = float(input('Digite primer numero: '))
num2 = float(input('Digite segundo numero: '))
num3 = float(input('Digite tercer numero: '))
if num1 > num2 and num1 > num3:
    print('El numero mayor es:', num1, '\n\n')
elif num2 > num1 and num2 > num3:
    print('El numero mayor es: ', num2, '\n\n')
else:
    print('El numero mayor es:', num3, '\n\n')
# 2. Leer un numero positivo y determinar si es par o impar
num = int(input('Digite un numero: '))
num %= 2
if num == 0:
    print('El numero es par')
else:
    print('El numero es impar')
