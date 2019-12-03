package a22SobrecargaMetodos;

/*@author Panzer01*/
public class A72SobrecargaMetodos {
    
    public static void main(String[] args) {
        System.out.println("Resultado 1: " + A72Operaciones.sumar(3, 4));

        System.out.println("Resultado 2: " + A72Operaciones.sumar(5, 4.1));

        System.out.println("Resultado 3: " + A72Operaciones.sumar(7.1, 3));

        System.out.println("Resultado 4: " + A72Operaciones.sumar(2.2, 6.8));

        //¿Cual metodo se manda llamar?
        //L(long),su convercion automatica superior es double.
        System.out.println("Resultado 5: " + A72Operaciones.sumar(3, 1L));//la  L o l es de long

        //¿Cual metodo se manda llamar?
        //A es del tipo char, su convercion automatica superior es de tipo entero.
        //F(float), su convercion automatica superior es double.
        System.out.println("Resultado 6: " + A72Operaciones.sumar(3F, 'A'));//La F o f es de Float
    }
}
