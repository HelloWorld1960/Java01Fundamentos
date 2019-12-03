package a24PalabraFinal;

/*@author Panzer01*/
public class A76EjemploPalabraFinal {
    public static void main(String[] args) {
        //Marca error, no se puede modificar el valor de una variable final
        //A76ClaseFinal.varPrimitivo = 15;
        
        //No es posible cambiar la referencia de la variable persona
        //A76ClaseFinal.persona = new Persona();
        
        System.out.println("Nombre persona:" + A76ClaseFinal.persona.getNombre());
        
        //Pero si es posible cambiar el estado del objeto 
        //referenciado por la variable persona
        A76ClaseFinal.persona.setNombre("Otro");
        
        System.out.println("Nombre persona:" + A76ClaseFinal.persona.getNombre());
    }   
}
