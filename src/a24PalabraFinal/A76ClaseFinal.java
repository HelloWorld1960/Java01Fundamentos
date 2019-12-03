package a24PalabraFinal;
/*@author Panzer01*/

//Clase marcada como final
//Es decir que ya no podremos crear clases hijas de esta clase.
public final class A76ClaseFinal {

    //Variables marcadas como finales.
    //Ya no pueden ser modificadas.
    //A la convinacion de public static final se le conoce como constantes.
    public static final int varPrimitivo = 10;

    //Instancia marcada como final.
    /*Ya no se puede modificar la referencia del objeto, pero si el contenido al cual se esta referenciando.*/
    public static final A76Persona persona = new A76Persona();

    //Metodo final, estudiaremos el tema de sobreescritura en otra leccion
    public final void metodoFinal(){
    }
}
//La siguiente instancia marca error: No se puede heredad de una clase final
/*class ClaseHija extends A76ClaseFinal{
}*/