# Se tiene un array de enteros V de N cantidad de valores, y se desea guardar en
# R todos los numeros impares contenidos en V

.data
V:	.word 8, 3, 9, 6, 7 	# Valores del array
N:	.word 5			# Cant. de valores
R:	.word 0, 0, 0, 0	# Resultado (inicializado en 0)

.text
main:
	la t0, V
	la t1, N
	la t2, R
	
	lw s0, 0(t1)		# s0 <-- N
	li t1, 4		# t1 <-- tamaño del dato

while: beqz s0, finWhile 	#s0=j;j!=0;j finwhile
	
	lw s1, 0(t0) # s1 <-- &V 
	
	# Invocamos rutina de chequeo #
	mv a0, s1
	jal, ra, chequeo
	
	add t0, t0, t1
	addi s0, s0, -1		# --j	
	j while
	
finWhile:
	li a7, 10
	ecall	
	
######## rutinas ########
	
chequeo: ##argumentos: a0 <-- valor a chequear paridad
	li t6, 2 
	rem a6, a0, t6 		# a6 <-- a0 % t6
	jr ra 			#return incondicional
	

######## Notas ########
## Los registros 'a' suelen ser utilizados para almacenar argumentos de rutinas
## y para valores de retorno.
		
			
				
					
						
							
								
									
										
											
												
													
														
															
						