"""Clase del 18/05/2021."""
# Ejercicio1
precio_manzana = 1200
cant_manzana = 5
precio_cilantro = 1200
cant_cilantro = 3
precio_perejil = 300
cant_perejil = 3
subtotal = 0
print('calculando el total de tu mercado...')
total_manzana = precio_manzana * cant_manzana
print('El valor total de las manzanas es: $'+str(total_manzana))
subtotal += total_manzana
print('...El subtotal seria: $'+str(subtotal))
total_cilantro = precio_cilantro * cant_cilantro
print('El valor total del cilantro es: $'+str(total_cilantro))
subtotal += total_cilantro
print('...El subtotal seria: $'+str(subtotal))
total_perejil = precio_perejil * cant_perejil
print('El valor total de las perejils es: $'+str(total_perejil))
subtotal += total_perejil
print('...El subtotal seria: $'+str(subtotal))
print('---EL total del mercado es: $'+str(subtotal))
# Ejercicio2
cont_manzanas = 0
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
      + ' manzanas')
cont_manzanas += 1
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
            + ' manzanas')
cont_manzanas += 1
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
            + ' manzanas')
cont_manzanas += 1
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
            + ' manzanas')
cont_manzanas += 1
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
            + ' manzanas')
cont_manzanas += 1
print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
            + ' manzanas')
for cont_manzanas in range(-1):
    print('Se ha iniciado el carrito. En total hay: ' + str(cont_manzanas)
                + ' manzanas')
    cont_manzanas += 1
