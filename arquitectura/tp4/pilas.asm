##Uso de macros

#Apila el valor actual de a6 en 0(sp) y modifica el puntero a la pila a un espacio vacio  
.macro Apilar()
	sw a6, 0(sp) 
	addi sp, sp, -4
.end_macro

#Mueve el puntero de la pila a un espacio superior y reemplaza el valor almacenado por el 
#que esta actualmente en a6

.macro Desapilar()
	addi sp, sp, 4
	sw a6, 0(sp)
.end_macro

#Finalziar el programa
.macro fin
	li a7, 10
	ecall
.end_macro

#Mostrar entero
.macro print_int (%x)
	li a7, 1
	addi a0, %x, 0
	ecall
.end_macro

#Mostrar string
.macro print_str (%str)
	.data
	myLabel: .asciz %str
	.text
	li a7, 4
	la a0, myLabel
	ecall
.end_macro

# generic looping mechanism
.macro for (%regIterator, %from, %to, %bodyMacroName)
	lw t0, 0(%regIterator) #carga el dato en el registro a utilizar
	Loop: 
	%bodyMacroName()
	
	addi t0, t0, 4
	addi %from, %from, 1
	ble %from, %to, Loop
.end_macro
	
	#print an integer
.macro body()
	print_int t0
	print_str "\n"
.end_macro
	
.text
main:
	lw s0, 0(sp)	
	
	li t0, 0
	li t1, 1
	li t2, 2
	li t3, 3
	li t4, 4
	
	li t5, 10
	
	mv a6, t0
	Apilar

	mv a6, t1
	Apilar

	mv a6, t2
	Apilar

	mv a6, t3
	Apilar

	mv a6, t4
	Apilar 
	
	
	mv a6, t5
	Desapilar
	
	li s7, 1 #contador = 1
	li s8, 5 #cant. de elementos = 6
	
	for(s0, s7, s8, body)
	
	fin
	

    
