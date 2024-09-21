n = int(input("Ingresa un número")) #Leer entrada como cadena y convertir a entero

def factorial (n):#def es para declarar una función
    if (n==1 or n==0):
        return 1
        
    if (n<0):
        print("ingresa un número positivo")

    return n * (factorial(n-1))
    

print(factorial(n))