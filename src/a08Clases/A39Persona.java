package a08Clases;

/*@author Panzer01*/
public class A39Persona {
    //Atributos de una clase
    //No es necesario asignar valores
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;

    //Metodos de la clase
    //Los usaran los objetos de esta clase
    public void desplegarNombre() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido Paterno : " + apellidoPaterno);
        System.out.println("Apellido Materno : " + apellidoMaterno);
    }
}
