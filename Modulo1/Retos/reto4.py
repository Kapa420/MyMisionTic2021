"""Reto 3."""


def calcular_bandejas(arg, ban):
    """Calcula cuantas bandejas necesitan los huevos."""
    return (arg // ban)


def clasificacion_huevos(arg):
    """Define la funcion clasificacion_huevos.

    Clasifica los huevos segun peso.
    """
    huevosBC = 0
    huevosA = 0
    huevosAA = 0
    huevosAAA = 0
    ban_huevosBC = 30
    ban_huevosA = 30
    ban_huevosAA = 24
    ban_huevosAAA = 12
    a = 'numero_huevos: '
    for element in arg:
        if (element < 46):
            huevosBC += 1
        elif (element > 46) and (element < 53):
            huevosBC += 1
        elif (element > 53) and (element < 60):
            huevosA += 1
        elif (element > 60) and (element < 67):
            huevosAA += 1
        elif (element > 67):
            huevosAAA += 1
    list = ('Tipo_huevo: A,' + ' ' + a + ' ' + str(huevosA) + ',' + ' ' +
            "numero_bandejas:" + ' ' +
            str(calcular_bandejas(huevosA, ban_huevosA))+'\n'
            'Tipo_huevo: AA,' + ' ' + a + ' ' + str(huevosAA) + ',' + ' ' +
            'numero_bandejas:' + ' ' +
            str(calcular_bandejas(huevosAA, ban_huevosAA))+'\n'
            'Tipo_huevo: AAA,' + ' ' + a + ' ' + str(huevosAAA) + ','  ' ' +
            'numero_bandejas:' + ' ' +
            str(calcular_bandejas(huevosAAA, ban_huevosAAA))+'\n'
            'Tipo_huevo: BC,' + ' ' + a + ' ' + str(huevosBC) + ',' + ' ' +
            'numero_bandejas:' + ' ' +
            str(calcular_bandejas(huevosBC, ban_huevosBC))+'\n')
    return list
