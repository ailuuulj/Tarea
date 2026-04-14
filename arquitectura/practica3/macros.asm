##Uso de macros


#Apila el valor actual de a6 en 0(sp) y modifica el puntero a la pila a un espacio vacio  
.macro Apilar()
    addi sp, sp, -4	
    sw a6, 0(sp) 
.end_macro

#Mueve el puntero de la pila a un espacio superior y reemplaza el valor almacenado por el 
#que esta actualmente en a6
.macro Desapilar()   
    lw a6, 0(sp)        
    addi sp, sp, 4
.end_macro

#Finalziar el programa
.macro fin
    li a7, 10
    ecall
.end_macro

#Mostrar entero
.macro print_int (%x)
    li a7, 1
    mv a0, %x
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

.macro body()
    print_int a6
    print_str "\n"
.end_macro

.text
main:
    li a6, 0
    Apilar
    li a6, 1
    Apilar
    li a6, 2
    Apilar
    li a6, 3
    Apilar
    li a6, 4
    Apilar

    li t0, 0          # contador
    li t1, 5          # cant. de elementos

loop:
    Desapilar         
    body              
    addi t0, t0, 1
    blt t0, t1, loop  

    fin