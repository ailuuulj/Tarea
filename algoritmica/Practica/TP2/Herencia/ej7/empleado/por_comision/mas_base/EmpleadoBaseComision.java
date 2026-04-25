package empleado.por_comision.mas_base;

import empleado.por_comision.EmpleadoComision;

public class EmpleadoBaseComision extends EmpleadoComision{
    int salario_base;
    public EmpleadoBaseComision(int salario_base, int comision_porcent, int brute_sells, String name, String dni){
        this.salario_base = salario_base;
        super(comision_porcent, brute_sells, name, dni);
    }

    protected int getBaseSalary(){return salario_base;}
    protected void setBaseSalary(int s){salario_base=s;}

    protected int getTotal(){return salario_base + getTotalSellsWithComission();}

    @Override
    public String toString(){
        return "Empleado Por Comision + Salario base:\n\tNombre: "+getName()+"\n\tDni: "+getDni()+"\n\tSalario Base: "+getBaseSalary()+"\n\tPorcentaje de comision por venta: "+super.getComission()+ "\n\tVentas brutas: " +super.getBruteSells()+"\n\tIngreso Total: "+getTotal();
    }
}
