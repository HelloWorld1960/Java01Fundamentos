package a12Laboratorio;

/*@author Panzer01*/
public class A12Cubo {
    //Atributos de la clase
    private int ancho;
    private int alto;
    private int profundo;
    
    //Constructor Vacio
    //Recordar que si agregamos un constructor distinto al vacio
    //ya no se crea este constructor y nosotros debemos crearlo si lo necesitamos
    public A12Cubo() {
    }

    //Constructor con 3 argumentos
    public A12Cubo(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    //Metodo para calcular el volumen
    public int calcularVolumen() {
        return ancho * alto * profundo;
    }

    public int calcularVolumen(int ancho, int alto, int profundo) {
        return ancho * alto * profundo;
    }
}
