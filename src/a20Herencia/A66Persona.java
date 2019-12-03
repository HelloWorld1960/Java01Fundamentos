package a20Herencia;

/*@author Panzer01*/
public class A66Persona { //Definicion de la clase Padre
    private String nombre;
    private char genero;
    private int edad;
    private String direccion;
    
    //Constructor vacio
    public A66Persona(){}
    
    //Constructor 1 argumento
    public A66Persona(String nombre){
        this.nombre = nombre;
    }
    
    //Constructor completo
    public A66Persona(String nombre, char genero, int edad, String direccion){
        this.nombre = nombre;
        this.genero = genero; //M-Masculino, F-Femenino
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores. */
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
}