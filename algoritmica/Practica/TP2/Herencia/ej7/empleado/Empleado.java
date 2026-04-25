package empleado;

public class Empleado{
    String nombre;
    String dni;

    public Empleado(String nombre, String dni){this.dni=dni;this.nombre=nombre;}

    public String getName(){return nombre;}
    public String getDni(){return dni;}

    public void setName(String n){nombre=n;}
    public void setDni(String d){dni=d;}

    @Override
    public String toString(){
        return "\nEmpleado:\n\tNombre: "+getName()+"\n\tDni: "+getDni();
    }

}