"""Reto 3."""
global ingresoem
ingresoem = ""
global ingresovi
ingresovi = ""
for i in range(4):
    usr = input()
    print('Usuario: '+usr)
    pwd = input()
    print('Contraseña: '+pwd)
    if((usr == 'admin') and (pwd == 'MisionTic2021')):
        break
    else:
        print('Credenciales incorrectas')
if (i < 3):
    c = 1
    while (c != 0):
        print("\n------Menú de registro de personal-----")
        print("1. Registrar ingreso de empleado.")
        print("2. Ver empleados ingresados.")
        print("3. Registrar ingreso de visitantes.")
        print("4. Ver visitantes ingresados.")
        print("\n0. Salir\n")
        c = input()
        print('Ingresa un número válido de opción del menú: '+c)
        if c == '1':
            ingresoem = ""
            while(ingresoem != 'SALIR'):
                A = input()
                print("Ingresa el nombre del empleado (Si no deseas agregar más, oprime la tecla SALIR): " + A)
                if A == 'SALIR':
                    break
                else:
                    ingresoem += A + ','
        elif c == '2':
            print('Los empleados registrados son: ' + ingresoem)
        elif c == '3':
            ingresovi = ""
            while(ingresovi != 'SALIR'):
                B = input()
                print("Ingresa el nombre del visitante (Si no deseas agregar más, digite SALIR): " + B)
                if B == 'SALIR':
                    break
                else:
                    ingresovi += B + ','
        elif c == '4':
            print('Los visitantes registrados son: ' + ingresovi)
        elif c == '0':
            print('¡Hasta luego!')
            break
        elif (c < '3') or (c > '0'):
            print("Por favor ingresa una opción válida")
else:
    print("Has agotado la cantidad de intentos, por favor inicie de nuevo el programa")
