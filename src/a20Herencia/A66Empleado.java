package a20Herencia;

/*@author Panzer01*/
public class A66Empleado extends A66Persona{

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    //Constructor con 2 argumentos.
    public A66Empleado(String nombre, double sueldo) {
        //super invoca al constructor de la clase superior que comparta el mismo tipo de parametrización.
        super(nombre); //Super debe ser la primera linea.
        this.idEmpleado = ++contadorEmpleados; //pre incremento.
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
     @Override
    public String toString() {
        //Primero mandamos a llamar el metodo toString de la clase Persona
        //para que podamos observar los valores de la clase Padre, 
        //y despues imprimimos los valores de la clase hija
        return (super.toString() + " Empleado{" + "idEmpleado=" + idEmpleado + ", sueldo=" + sueldo + '}');
    }

}