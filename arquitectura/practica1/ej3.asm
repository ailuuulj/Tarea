#    3. Secuencia de valores: Escribir un programa donde: 
#	? x3 tome los valores 0,1,2,3,4,5... 
#	? x4 tome los valores 0,3,6,9,12,15... 
#	? x5 tome los valores 0,5,10,15,20,25... indefinidamente.
#	Ejecutarlo paso a paso para verificar su funcionamiento. 

	.text
main:
	li x3 0
	li x4 0
	li x5 0
loop:	
	addi t0,t0, 1
	addi t1,t1, 3
	addi t2, t2, 5
	beqz t1, fin 		#esto no pasa
	mv x3,t0		# x3<-- t0

	
	mv x4, t1 		# x4<-- t1
	mv x5, t2		# x5
	
	j loop
	
	
fin:
	#algo
	
	
	 
