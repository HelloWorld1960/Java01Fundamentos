package a16PalabraThis;

/*@author Panzer01*/
public class A57PalabraThis {
    public static void main(String[] args) {
        Persona p = new Persona("Juan");
    }    
}

class Persona {
    String nombre;//atributo de la clase

    /*Constructor de la clase*/
    Persona(String nombre) {
        this.nombre = nombre; //this es el objeto Persona (actual)

        //Imprimimos el objeto persona
        Imprimir i = new Imprimir();
        i.imprimir(this); //this es el objeto Persona (actual). 
    }
}

class Imprimir {

    public void imprimir(Object o) {
        System.out.println("Imprimir parametro: " + o);//el parametro es el objeto persona, el cual se paso como parametro.
        System.out.println("Imprimir objeto actual (this): " + this); //this es el objeto imprimir (actual)
    }
}
