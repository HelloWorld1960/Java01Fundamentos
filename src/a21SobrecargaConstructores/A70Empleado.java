package a21SobrecargaConstructores;

/*@author Panzer01*/
public class A70Empleado extends A70Persona{
    /*Atributos*/
    private double sueldo;
    
    //Constructor 
    public A70Empleado(String nombre, int edad, double sueldo) {
        //Llamando al constructor publico de la clase A70Persona.
        super(nombre, edad); //Super debe ser la primera linea
        this.sueldo = sueldo;
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
        //Primero mandamos a llamar el mÃ©todo toString de la clase Persona
        //para que podamos observar los valores de la clase Padre, 
        //y despues imprimimos los valores de la clase hija
        return super.toString() + " Empleado{sueldo=" + sueldo + "}";
    }
}