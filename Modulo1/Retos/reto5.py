"""Reto 5."""


def Ahorro(Mes):
    """Devuelve el dato de la suma y el mes."""
    if (type(Mes) == str):
        a = Mes.split(',')
        b = len(a)
    else:
        a = Mes
        b = len(a)
    suma = 0
    for element in range(1, b):
        suma += int(a[element])
    return suma


def ahorro(registroDeAhorro):
    """Establece cual es el ahorro de cada persona."""
    perro = registroDeAhorro.split(';')
    EneroL = perro[0].split(',')
    FebreroL = perro[1].split(',')
    MarzoL = perro[2].split(',')
    AbrilL = perro[3].split(',')
    EneroL = Ahorro(EneroL)
    FebreroL = Ahorro(FebreroL)
    MarzoL = Ahorro(MarzoL)
    AbrilL = Ahorro(AbrilL)
    frase = {'Enero': EneroL, 'Febrero': FebreroL, 'Marzo': MarzoL, 'Abril': AbrilL}
    return frase


def calculadoraMes(registroDeAhorro, nombre):
    """Define calculadoraMes."""
    a = (f'{nombre}', ahorro(registroDeAhorro))
    return a
