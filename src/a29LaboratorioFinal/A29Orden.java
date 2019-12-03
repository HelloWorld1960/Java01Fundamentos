package a29LaboratorioFinal;

/*@author Panzer01*/
public class A29Orden {
    /*Atributos*/
    private int idOrden;
    private A29Computadora computadoras[];//Declaracion del arreglo de computadoras.
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras = 10;//Definimos el maximo elementos del arreglo
    
    /*Constructor*/
    public A29Orden(){
        this.idOrden=++contadorOrdenes;
        //Se instancia el arreglo de computadoras
        computadoras=new A29Computadora[maxComputadoras];
    }
    
    /*Metodos*/
    public void agregarComputadora(A29Computadora computadora){
        //Si los computadoras agregadas no superan al maximo de computadoras
        //agregamos la nueva computadora.
        if (contadorComputadoras < maxComputadoras) {
            //Agregamos la nueva computadora al arreglo
            //e incrementamos el contador de computadoras
            computadoras[contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha superado el maximo computadoras: " + maxComputadoras);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Orden :#" + idOrden);
        System.out.println("Productos de la orden #" + idOrden + ": "+contadorComputadoras+" computadoras"+"\n");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
    
}
