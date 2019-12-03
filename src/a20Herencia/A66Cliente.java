package a20Herencia;

import java.util.Date;

/*@author Panzer01*/
public class A66Cliente extends A66Persona{
    private int idCliente;
    private java.util.Date fechaRegistro;
    private boolean vip;
    private static int contadorClientes;

    //Constructor.
    public A66Cliente(Date fechaRegistro, boolean vip) {
        this.idCliente = ++contadorClientes;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    /*@Override indica que se esta sobre escribiendo el comportamiento de un metodo de la clase padre o clases superiores. */
    //Metodo que imprime el estado del objeto.
    //El metodo toString nos permite convertir un objeto Java en una cadena.
    @Override
    public String toString() {
        //Primero mandamos a llamar el mÃ©todo toString de la clase Persona
        //para que podamos observar los valores de la clase Padre, 
        //y despues imprimimos los valores de la clase hija
        return super.toString() + " Cliente{" + "idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + '}';
    }
}