package a10Metodos;

/*@author Panzer01*/
public class A43PruebaAritmetica {
    public static void main(String[] args) {
        //Creamos un objeto de la clase aritmetica
        A43Aritmetica a = new A43Aritmetica();
        
        //Llamamos al metodo sumar y recibimos el valor devuelto.
        int resultado = a.sumar(3, 5);
        
        //Imprimimos el resultado
        System.out.println(resultado);
    }
}
