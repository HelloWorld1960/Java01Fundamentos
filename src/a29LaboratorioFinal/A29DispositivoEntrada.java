package a29LaboratorioFinal;

/*@author Panzer01 */
public class A29DispositivoEntrada {
    /*Atributos*/
    private String tipoEntrada;
    private String marca;
    
    /*Constructor*/
    public A29DispositivoEntrada() {
    }
    /*Constructor sobrecargado*/
    public A29DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada=tipoEntrada;
        this.marca=marca;
    }
    
    /*Metodos*/
    public String getTipoEntrada(){
        return (tipoEntrada);
    }
    public void setTipoEntrada(String tipoEntrada){
        this.tipoEntrada=tipoEntrada;
    }
    
    public String getMarca(){
        return (marca);
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores.*/
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        return ("Dispositivo de entrada{"+"tipo de entrada="+tipoEntrada+", marca="+marca+"}");
    }
}
