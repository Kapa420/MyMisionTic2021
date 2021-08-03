"""Clase del 11/05.
Uso de estructuras de control.
"""
grade = float(input('Ingrese su nota promedio: '))
if grade < 5:
    print('Su estado es supendido')
elif grade < 7:
    print('Su estado es aprobado')
elif grade <= 9:
    print('Su estado es notable')
elif grade == 10:
    print('Su estado es sobresaliente')
elif grade > 10:
    print('Nota no valida')
else:
    print('Su nota es suspendido')
