package a18Encapsulamiento;

/*@author Panzer01*/
public class A61Persona {
   //Constructor Vacio
   //Lo agregamos para tener la posibilidad de crar un objeto que no reciba parametros.
    public A61Persona() {
    }

    //Constructor con 3 argumentos
    public A61Persona(String nombre, String apellido, boolean borrado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    //Atributos privados
    private String nombre;
    private String apellido;
    private boolean borrado;

    //Metodos publicos para acceder y/o modificar los atributos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }
    
    //Metodo que imprime el estado del objeto
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", borrado=" + borrado + '}';
    }
}