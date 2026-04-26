package tp2ej7;

public class EmpleadoPorComision extends Empleado{
	private double porcentajeComision;
	private int ventasBrutas;
	
	public double getPorcentajeComision() {
		return this.porcentajeComision;
	}
	public int getVentasBrutas() {
		return this.ventasBrutas;
	}
	
	
	public EmpleadoPorComision(double porcentajeComision, int ventasBrutas, String dni, String nombre) {
		super(nombre,dni);
		this.porcentajeComision = porcentajeComision;
		this.ventasBrutas = ventasBrutas;
	}
	@Override
	public String toString(){
		return getNombre() + " " + getDni()+ " " + ventasBrutas + " %" + porcentajeComision;
	}
}
