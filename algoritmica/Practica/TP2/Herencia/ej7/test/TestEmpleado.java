package test;

import empleado.*;
import empleado.asalariado.EmpleadoAsalariado;
import empleado.por_comision.EmpleadoComision;
import empleado.por_comision.mas_base.EmpleadoBaseComision;
import empleado.por_hora.EmpleadoPorHora;

public class TestEmpleado{
    public static void main(String []args){
        int cant=4;
        Empleado []empleados = new Empleado[cant];
        EmpleadoAsalariado e = new EmpleadoAsalariado("test", "1234", 2000);
        EmpleadoBaseComision e0 = new EmpleadoBaseComision(2000, 10, 15, "testing", "12345");
        EmpleadoComision e1 = new EmpleadoComision(10, 100, "testing1", "123456");
        EmpleadoPorHora e2 = new EmpleadoPorHora(20, 15, "testing2", "1234567");

        empleados[0] = e;
        empleados[1] = e0;
        empleados[2] = e1;
        empleados[3] = e2;

        for (int i = 0; i < cant; i++) {
            System.out.println(empleados[i]);   
        }
        
    }
}

