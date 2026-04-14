
# Programa hola mundo en RISC-V 
         .data 
str:     .asciz "Hola mundo en RISC-V!\nEste es mi programa personalizado\n\tMirenlo" 

         .text 
main:   
         la a0, str 
         li a7, 4   
         ecall 
          
         li a7, 10 
         ecall    