/*. Crear la clase Empleado que tiene como atributos nombre y número de documento, además crear las subclases: 
 * EmpleadoAsalariado que tiene el valor del salario mensual, 
 * EmpleadoPorHora el valor de la hora y el número de horas trabajadas, 
 * EmpleadoPorComision el porcentaje de comisiones y las ventas brutas, 
 * EmpleadoBaseMasComision (subclase de la anterior) que contiene el salario base. 
 * Cada clase debe contener los constructores y los métodos gets y sets apropiados. 
 * Escribir un programa que cree instancias de  cada clase y muestre toda la información asociada 
 * para cada objeto incluso la información heredada.*/
package tp2ej7;

public class Empleado {
	private String nombre;
	private String dni;
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDni() {
		return this.dni;
	}
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	
	
}


