package tp2ej7;

public class EmpleadoAsalariado extends Empleado{
	private double salarioMensual;
	
	public double getsalarioMensual() {
	return this.salarioMensual;
	}
	
	public EmpleadoAsalariado(double salarioMensual, String dni, String nombre) {
		super(nombre, dni);
		this.salarioMensual = salarioMensual;
	}
	
	@Override
	public String toString(){
		return getNombre() + " " + getDni() + " " + salarioMensual;
	}
}
