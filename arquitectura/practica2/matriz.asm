# Sumar todos los elementos impares de una matriz 2x3

.data

M: 	.word 1,5,6	#M[3][3] = [1,5,6][8,3,4]
	.word 8, 3, 4
	
CF: 	.word 2 	#cant filas 
CC: 	.word 3 	#cant columnas
RES: 	.space 4 

.text

main:
	la t0, M 	# t0 <-- Matriz
	la t1, CF	# t1 <-- Cant. filas
	la t2, CC	# t2 <-- Cant. columnas
	la t3, RES	# t3 <-- Resultado
	li t4, 4	# t4 <-- 4
	li t5, 0	# i <-- 0 
	li s10, 2	# divisor (para la instruccion 'rem') 
	li s9, 0 	# acumulador
	
	lw s0, 0(t1) 	# s0 <-- CF
	lw s1, 0(t2)	# s1 <-- CC
	li t5, 0 	# condicional para el 'beq'.

# -Bucle for por filas- #
forF:	beq t5, s0, finForF
	li t6,0		# j <-- 0
	
	j forC
# -Bucle for por columnas- #
forC:	beq t6, s1, finForC
	mul t1, t5, s1  # t1 <-- i * CC
	add t2, t1, t6	# k <-- (i * CC) + j
	
	mul t1, t2, t4 	# desp <-- k * len(word)
	add s2, t1, t0 	# &M[i,j] <-- &M + desp
	
	lw s3, 0(s2) 	# s3 <-- M[i,j]
	
	# chequeamos paridad # 
	rem s4, s3, s10 #s4 <-- s3 % 2
	
	# Condicion incorrecta (chequear si es impar) #
	#beqz s4, esimpar
	#j finIter
	
	# Condicion correcta (chequear si es par ahorra la instruccion 'j') #
	beqz s4, finIter
	add s9, s5, s4
	j forC

#esimpar:
#	add s9, s9, s4
#	j forC

finIter: 
	addi t6, t6, 1	 # ++j
	j forC

finForC:
	addi t5, t5, 1	# ++i
	j forF
	
finForF:
	sw s9, 0(t3) 
	li a7, 10
	ecall	
	
#####Teniendo cualquier dato/cifra y queriendo saber si es par/impar
# 010101 = dato		#* queremos buscar si hay o no un 1 en el ultimo bit.
# 000001 = mascara  	#* usamos una mascara donde el unico bit con 1 es el ultimo.
## al aplicar un and entre el dato y la mascara, podemos saber si el
## ultimo bit tiene un 1 o un 0.
### Nota:
### Recorrer por filas es más rápido solo si el lenguaje de programación utiliza 
### almacenamiento "row-major" (fila mayor), que es lo más común (C, C++, Java, Python).
### En este caso, el acceso secuencial fila a fila aprovecha la memoria caché de la CPU, 
### reduciendo tiempos. Si el lenguaje o formato usa "column-major" (ej. Fortran, MATLAB), 
### recorrer por columnas es más rápido.


##Macro para imprimir un entero:
#.macro print_int (%x)
#	li a7, 1
#	add $a0, $zero, %x
#	syscall
#	.end_macro
#	
#	print_int ($s0)
#	print_int (10)
