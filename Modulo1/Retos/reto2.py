"""Reto #2.
IMC = peso/(altura^2).
Determinar la categoria del IMC.
"""
peso = int(input())
altura = float(input())
IMC = peso / (altura*altura)
# Niveles de IMC.
if IMC < 18.5:
    print('Bajo peso')
elif IMC >= 18.5 and IMC < 24.9:
    print('Normal')
elif IMC >= 25 and IMC < 29.9:
    print('Sobrepeso')
else:
    print('Obeso')
