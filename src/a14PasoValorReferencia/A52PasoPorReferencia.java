package a14PasoValorReferencia;

/*@author Panzer01*/
public class A52PasoPorReferencia {
    public static void main(String[] args) {
        /*Instancia de la clase*/
        A52Persona p = new A52Persona();
        
        p.cambiarNombre("Juan");
        imprimirNombre(p);//Imprime Juan
        modificarPersona(p);
        imprimirNombre(p);//Imprime Carlos
    }

    //atributo arg del tipo A52Persona.
    //El atributo arg es un atributo referencia a el objeto creado p y puede acceder a los metodos de p .
    public static void modificarPersona(A52Persona arg){
        arg.cambiarNombre("Carlos");
    }
    
    //atributo p del tipo A52Persona.
    //El atributo pA es un atributo referencia a el objeto creado p y puede acceder los metodos de p.
    public static void imprimirNombre(A52Persona pA ){
        System.out.println("Valor recibido :" + pA.obtenerNombre());
    }
}
