package empleado.por_hora;

import empleado.Empleado;

public class EmpleadoPorHora extends Empleado{
    int valor_hora;
    int banco_horas;

    public EmpleadoPorHora(int hour_value, int hour_bank, String name, String dni){this.valor_hora = hour_value; this.banco_horas=hour_bank;super(name, dni);}

    protected int getValPerHour(){return valor_hora;}
    protected int getHourBank(){return banco_horas;}

    protected void setValPerHour(int val){valor_hora=val;}
    protected void setHourBank(int bank){banco_horas=bank;}

    protected void incrementHourBank(){banco_horas++;}
    protected void incrementHourBank(int hours){banco_horas+=hours;}

    protected int getTotalValPerBankHours(){return valor_hora*banco_horas;}

    @Override
    public String toString(){
        return "Empleado Por Hora: \n\tNombre: "+getName()+"\n\tDni: "+getDni()+"\n\tIngreso por hora: "+getValPerHour()+"\n\tTotal de horas: "+getHourBank()+"\n\tIngreso Total: "+getTotalValPerBankHours();
    }
}
