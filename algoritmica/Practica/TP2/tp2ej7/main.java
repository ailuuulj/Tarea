/*. Crear la clase Empleado que tiene como atributos nombre y número de documento, además crear las subclases: 
 * EmpleadoAsalariado que tiene el valor del salario mensual, 
 * EmpleadoPorHora el valor de la hora y el número de horas trabajadas, 
 * EmpleadoPorComision el porcentaje de comisiones y las ventas brutas, 
 * EmpleadoBaseMasComision (subclase de la anterior) que contiene el salario base. 
 * Cada clase debe contener los constructores y los métodos gets y sets apropiados. 
 * Escribir un programa que cree instancias de  cada clase y muestre toda la información asociada 
 * para cada objeto incluso la información heredada.*/
package tp2ej7;

public class main {

	public static void main(String[] args) {
		
		Empleado[] empleados = new Empleado[4];   
		
		EmpleadoAsalariado empleado1 = new EmpleadoAsalariado(300000, "Ailen", "47.301.318");
		EmpleadoBaseMasComision empleado2 = new EmpleadoBaseMasComision("Jesica", "27.822.855",1000000, 50, 30);
		EmpleadoPorComision empleado3 = new EmpleadoPorComision(30, 50,"Thiago", "47.301.571");
		EmpleadoPorHora empleado4 = new EmpleadoPorHora("Hector", "27.774.324", 5000, 8);
		
		empleados[0] = empleado1;
		empleados[1] = empleado2;
		empleados[2] = empleado3;
		empleados[3] = empleado4;
		
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i]);
		}
		
	}
	
}
