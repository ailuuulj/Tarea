package empleado.por_comision;

import empleado.Empleado;

public class EmpleadoComision extends Empleado{
    Integer comision_porcent;
    Integer brute_sells;

    public EmpleadoComision(int comision_porcent, int brute_sells, String name, String dni){this.comision_porcent=comision_porcent; this.brute_sells=brute_sells; super(name, dni);}

    protected int getComission(){return comision_porcent;}
    protected int getBruteSells(){return brute_sells;}

    protected void setComission(int com){comision_porcent = com;}
    protected void setBrute(int brute){brute_sells=brute;}

    protected int getTotalSellsWithComission(){return brute_sells + ((brute_sells*comision_porcent)/100);}

    @Override
    public String toString(){
        return "Empleado Por Comision:\n\tNombre: "+getName()+"\n\tDni: "+getDni()+"\n\tVentas brutas: "+brute_sells.toString()+"\n\tPorcentaje de comision por venta: "+comision_porcent.toString()+"\n\tIngreso Total: "+getTotalSellsWithComission();
    }
    
}
