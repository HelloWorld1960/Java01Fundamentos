package a29LaboratorioFinal;

/*@author Panzer01*/
public class A29Monitor {
    /*Atributos*/
    private int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;

    /*Constructor vacio*/
    private A29Monitor(){
        /*Asignamos el idMonitor unico para objeto creado*/
        this.idMonitor=++contadorMonitores;
    }

    /*Constructor sobrecargado*/
    public A29Monitor(String marca, double tamaño){
        /*Llamamos al constructor vacio para asignar el idMonitor*/
        this();
        this.marca=marca;
        this.tamaño=tamaño;
    }

    /*Metodos*/
    public String getMarca(){
        return (marca);
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public double getTamaño(){
        return (tamaño);
    }
    public void setTamaño(double tamaño){
        this.tamaño=tamaño;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString(){
        return ("monitor{idMonitor=#"+idMonitor+", marca="+marca+", tamaño="+tamaño+"\"}");
    }
}
