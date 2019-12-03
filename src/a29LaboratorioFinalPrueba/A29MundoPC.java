package a29LaboratorioFinalPrueba;

import a29LaboratorioFinal.*;

/*@author Panzer01*/
public class A29MundoPC {
    public static void main(String[] args) {
        //ORDEN 1
        //Creamos objetos A29Monitor.
        A29Monitor m1 = new A29Monitor("Samsung", 14);
        A29Monitor m2 = new A29Monitor("LG", 16);
        //Creamos objetos A29Raton.
        A29Raton r1 = new A29Raton("USB","Logitech");
        A29Raton r2 = new A29Raton("USB","Genius");
        //Creamos objetos A29teclado
        A29Teclado t1 = new A29Teclado("USB", "Lenovo");
        A29Teclado t2 = new A29Teclado("USB", "Toshiba");
        
        //Creamos objetos A29Computadora
        A29Computadora c1 = new A29Computadora("DELL", m1, t1, r1);
        A29Computadora c2 = new A29Computadora("Hewlett-Packard", m2, t2, r2);
        
        //Creamos objetos A29Orden.
        A29Orden orden1 = new A29Orden();
        
        //Agregamos la computadora a la orden
        orden1.agregarComputadora(c1);
        orden1.agregarComputadora(c2);
        
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        //ORDEN 2
        //Creamos objeto A29Monitor.
        A29Monitor m3 = new A29Monitor("Sony", 16);
        //Creamos objetos A29Raton.
        A29Raton r3 = new A29Raton("USB","Compq");
        //Creamos objetos A29teclado
        A29Teclado t3 = new A29Teclado("USB", "Lanix");
        
        //Creamos objetos A29Computadora
        A29Computadora c3 = new A29Computadora("Sony", m3, t3, r3);
        
        //Creamos objetos A29Orden.
        A29Orden orden2 = new A29Orden();
        
         //Agregamos la computadora a la orden
        orden2.agregarComputadora(c3);
        orden2.agregarComputadora(c2);
        
        //Imprimimos la orden
        orden2.mostrarOrden();
        
        //ORDEN 3
        //Creamos objetos A29Orden.
        A29Orden orden3 = new A29Orden();
        
        //Agregamos la computadora a la orden
        orden3.agregarComputadora(c1);
        
        //Imprimimos la orden
        orden3.mostrarOrden();
    }    
}
