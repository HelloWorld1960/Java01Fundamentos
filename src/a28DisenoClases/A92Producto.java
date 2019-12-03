package a28DisenoClases;

/*@author Panzer01*/
public class A92Producto {
    /*Atributos*/
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor vacio
    private A92Producto() {
        //Asignamos el id producto unico por cada objeto creado
        this.idProducto = ++contadorProductos;
    }

    //Constructor sobrecargado de dos argumentos
    public A92Producto(String nombre, double precio) {
        //Llamamos al constructor vacio para asignar el idProducto
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    /*Metodos*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return ("Producto{" + "idProducto #" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}');
    }
}