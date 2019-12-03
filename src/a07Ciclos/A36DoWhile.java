package a07Ciclos;

/*@author Panzer01*/
public class A36DoWhile {
    public static void main(String[] args) {
        int contador = 0;
        int limite = 10;
        
        do{
            System.out.println("contador = " + contador);
            contador++;
        }while (contador < limite);
    }    
}
