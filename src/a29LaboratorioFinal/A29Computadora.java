package a29LaboratorioFinal;

/*@author Panzer01*/
public class A29Computadora {
    /*Atributos*/
    private int idComputadora;
    private String nombre;
    private A29Monitor monitor;
    private A29Teclado teclado;
    private A29Raton raton;
    private int contadorComputadoras;
    
    /*Constructor*/
    private A29Computadora(){
        //Asignamos el idComputadora unico para cada objeto creado.
        idComputadora=++contadorComputadoras;
    }
    
    public A29Computadora(String nombre, A29Monitor monitor, A29Teclado teclado, A29Raton raton){
        //Llamamos al constructor vacio para asignar el idComputadora.
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }
    
    /*Metodos*/
    public String getNombre(){
        return (nombre);
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public A29Monitor getMonitor(){
        return (monitor);
    }
    public void setMonitor(A29Monitor monitor){
        this.monitor=monitor;
    }
    
    public A29Teclado getTeclado(){
        return (teclado);
    }
    public void setTeclado(A29Teclado teclado){
        this.teclado=teclado;
    }
    
    public A29Raton getRaton(){
        return (raton);
    }
    public void setRaton(A29Raton raton){
        this.raton=raton;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString(){
        return ("Computadora {nombre:"+nombre+", "+"\n"+"Monitor:"+monitor+", "+"\n"+"Teclado:"+teclado+", "+"\n"+"Raton="+raton+"}"+"\n");
    }
    
}
