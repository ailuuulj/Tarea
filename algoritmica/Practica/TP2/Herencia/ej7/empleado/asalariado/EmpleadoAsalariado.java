package empleado.asalariado;

import empleado.Empleado;

public class EmpleadoAsalariado extends Empleado{
    int salario_mensual;

    public EmpleadoAsalariado(String name, String dni, int salario_mensual){this.salario_mensual = salario_mensual; super(name, dni);}

    public int getSalary(){return salario_mensual;}
    public void setSalary(int s){salario_mensual=s;}

    @Override
    public String toString(){
        return "Empleado Asalariado:\n\tNombre: "+getName()+"\n\tDni: "+getDni()+"\n\tSalario mensual: "+getSalary();
    }
}
