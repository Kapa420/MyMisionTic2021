"""Clase 25.05.2021.

Realizar un juego de frio caliente, donde el programa elige un numero
al azar y el usuario adivina que numero escogio el programa.
"""
from random import randint

number = randint(0, 100)

tries = 0

print("Hola, vamos a jugar, estoy pensando un numero y tienes que adivinarlo")

guess = int(input('Que numero estoy pensando?: '))

while tries < 7:
    if guess == number:
        print('Felicitaciones, adivinaste en', tries, ' intentos, el numero era:', number)
        break
    else:
        if guess > number:
            print('No, soy mas pequeño')
        else:
            print('No, soy mas grande')
        guess = int(input('Que numero estoy pensando?: '))
        tries += 1
if tries == 7:
    print('No adivinaste el numero, la respuesta correcta era', number)
