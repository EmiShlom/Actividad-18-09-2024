dividendo = 15
divisor=3
cociente = 0
residuo=0

if (divisor != 0):
	while(dividendo>=divisor):
		dividendo = dividendo - divisor
		cociente += 1
	residuo = dividendo 
	print("El cociente es:", cociente) #Se usa una coma porque no estamos concatetando una cadena, sino imprimos un entero 
	print("El residuo es:", residuo)
else:
	print("el divisor debe ser diferente de 0")
