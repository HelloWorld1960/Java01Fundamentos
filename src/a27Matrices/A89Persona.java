package a27Matrices;

/*@author Panzer01*/
public class A89Persona {
    private String nombre;

    public A89Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + getNombre() + '}';
    }
}
