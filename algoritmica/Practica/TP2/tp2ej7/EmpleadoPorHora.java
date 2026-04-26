package tp2ej7;

public class EmpleadoPorHora extends Empleado {
	private int ValorHora;
	private int HorasTrabajadas;
	
	public int getValorHora() {
		return this.ValorHora;
	}
	public int getHorasTrabajadas() {
		return this.HorasTrabajadas;
	}
	
	public EmpleadoPorHora(String nombre, String dni, int ValorHora, int HorasTrabajadas) {
		super(nombre,dni);
		this.ValorHora = ValorHora;
		this.HorasTrabajadas = HorasTrabajadas;
	}
	@Override
	public String toString(){
		return getNombre() + " " + getDni() + " "+ ValorHora + " "+ HorasTrabajadas;
	}
}
