package a28DisenoClases;

/*@author Panzer01*/
public class A92Orden {
    /*Atributos*/
    private final int idOrden;
    private final A92Producto productos[];//Declaracion del arreglo de productos.
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int maxProductos = 10;//Definimos el maximo elementos del arreglo

    public A92Orden() {
        this.idOrden = ++contadorOrdenes;
        //Se instancia el arreglo de productos
        productos = new A92Producto[maxProductos];
    }

    public void agregarProducto(A92Producto producto) {
        //Si los productos agregados no superan al maximo de productos
        //agregamos el nuevo producto
        if (contadorProductos < maxProductos) {
            //Agregamos el nuevo producto al arreglo
            //e incrementamos el contador de productos
            productos[contadorProductos++] = producto;
        }
        else{
            System.out.println("Se ha superado el maximo de productos: " + maxProductos);
        }
    }
    
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden() {
        System.out.println("Orden #:" + idOrden);
        System.out.println("Total de la orden #"+ idOrden + ": $" + calcularTotal());
        System.out.println("Productos de la orden #" + idOrden + ":");
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);
        }
    }
}