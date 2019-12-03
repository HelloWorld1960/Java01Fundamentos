package a09Objetos;
import a08Clases.A39Persona;

/*@author Panzer01*/
public class A41PruebaPersona {
    public static void main(String args[]){
        //Creacion de un objeto
        //tipoDeDato(nombre de la clase) NombreAtributo = new constructoDeLaClase(normalmente tiene el nombre de la clase)
        //Por defecto Java crea un constructor vacio, pero si creamos un constructor, es nuestra responsabilidad llenarlo.
        A39Persona p1 = new A39Persona();
        
        //LLamando a un metodo del objeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplegarNombre();
        
        //Modificar valores
        p1.nombre = "Juan";
        p1.apellidoPaterno = "Esparza";
        p1.apellidoMaterno = "Lara";
        
        //Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p1.desplegarNombre();  
        
        //Nuevo aobjeto
        A39Persona p2 = new A39Persona();
        
        //LLamando a un metodo del objeto creado
        System.out.println("\nValores por default del objeto Persona");
        p2.desplegarNombre();
        
        //Modificar valores
        p2.nombre = "Leyda";
        p2.apellidoPaterno = "Villareal";
        p2.apellidoMaterno = "Ku";
        
        //Volvemos a llamar al metodo
        System.out.println("\nNuevos valores del objeto Persona");
        p2.desplegarNombre(); 
    }
}
