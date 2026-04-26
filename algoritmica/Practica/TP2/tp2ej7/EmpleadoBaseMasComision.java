package tp2ej7;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double SalarioBase;
	
	public double getSalarioBase() {
		return this.SalarioBase;
	}
	
	public EmpleadoBaseMasComision(String nombre, String dni, double SalarioBase, int ventasBrutas, double porcentajeComision) { 
		super(porcentajeComision, ventasBrutas, dni, nombre);   //EmpleadoPorComision(ventasBrutas, porcentajeComision, dni, nombre)
		this.SalarioBase = SalarioBase;
	}
	
	@Override
	public String toString() {
		return getNombre() + " " + getDni()+ " " + SalarioBase + " " + getVentasBrutas() + " %" + getPorcentajeComision();
	}
}
