package a19PalabraStatic;

/*@author Panzer01*/
public class A63EjemploStatic {
    
    public static void main(String[] args) {
        A63Persona p1 = new A63Persona("Juan");
        System.out.println("Persona1: " + p1);
        
        A63Persona p2 = new A63Persona("Karla");
        System.out.println("Persona2: " + p2);
        
        //Imprimimos el contadorPersonas
        System.out.println("No. Personas:" + A63Persona.getContadorPersonas());   
    }
}