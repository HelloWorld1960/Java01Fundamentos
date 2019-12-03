package a28DisenoClasesPrueba;

import a28DisenoClases.*;

/*@author Panzer01*/
public class A92Ventas {
    public static void main(String[] args) {
        //Creamos varios objetos Producto
        A92Producto p1 = new A92Producto("Camisa",50.00);
        A92Producto p2 = new A92Producto("Pantalon",100.00);
        A92Producto p3 = new A92Producto("Corbata",30.00);
        
        //Creamos un objeto Orden
        A92Orden orden1 = new A92Orden();
        
        //Agregamos los productos a la orden
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.agregarProducto(p3);
        
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        //Creamos una segunda orden
        A92Orden orden2 = new A92Orden();
        
        //Creamos nuevos productos
        A92Producto p4 = new A92Producto("Zapatos", 200);
        A92Producto p5 = new A92Producto("Blusa", 90);
        
        //Agregamos productos a la orden 2
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p4);
        orden2.agregarProducto(p5);
        orden2.agregarProducto(p3);
        
        //Imprimimos la orden 2
        System.out.println("");
        orden2.mostrarOrden();
    }
}