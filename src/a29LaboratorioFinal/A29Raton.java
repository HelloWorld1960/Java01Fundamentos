package a29LaboratorioFinal;

/*@author Panzer01*/
public class A29Raton extends A29DispositivoEntrada{
    /*Atributos*/
    private int idRaton;
    private static int contadorRatones;
    
    /*Constructor vacio*/
    public A29Raton(){
    }
    /*Constructor sobrecargado que inicializa las variables*/
    public A29Raton(String tipoEntrada, String marca){
        /*super invoca al constructor de la clase superior que comparta el mismo tipo de parametrización, 
        es decir al constructor sobrecargado de la clase DispositivoEntrada.*/
        super(tipoEntrada, marca); //Super debe ser la primera linea.
        this.idRaton=++contadorRatones;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    /*super.toString() invoca al metodo de la clase padre, es decir A29DispositivoEntrada*/
    @Override
    public String toString() {
        return (super.toString()+" raton{" + "idRaton=#" + idRaton + "}");
    }
}
