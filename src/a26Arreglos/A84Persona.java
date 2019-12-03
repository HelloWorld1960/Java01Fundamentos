package a26Arreglos;

/*@author Panzer01*/
public class A84Persona {
    /*Atributos*/
    private String nombre;

    /*Constructor*/
    public A84Persona(String nombre) {
        this.nombre = nombre;
    }

    /*Metodos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores. */
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + getNombre() + '}';
    }
}
