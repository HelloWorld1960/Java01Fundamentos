package a21SobrecargaConstructores;

/*@author Panzer01*/
public class A70Persona {
    //Atributos
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersonas;

    //Constructor sin argumentos y privado
    //Asigna el idPersona
    private A70Persona() {
        this.idPersona = ++contadorPersonas;
    }

    //Constructor completo sobrecargado
    public A70Persona(String nombre, int edad) {
        //Se manda a llamar el constructor vacio para que se asigne el idPersona
        this();
        this.nombre = nombre;
        this.edad = edad;
    }

    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
}