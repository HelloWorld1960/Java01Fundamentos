package a15PalabraReturn;

/*@author Panzer01*/
public class A55PalabraReturnClases {
    public static void main(String args[]) {
        Suma s = creaObjetoSuma();
        int resultado = s.a + s.b;
        System.out.println("Resultado:" + resultado);
    }

    public static Suma creaObjetoSuma(){
        Suma s = new Suma(3, 4);
        return (s); /*Se retorna una referencia del objeto*/
    }
}
/*En Java es posible declarar varias clases dentro de un mismo archivo pero solamente una de ellas puede ser publica.
  El nombre de la clase publica debe corresponder con el nombre del archivo clase.*/
class Suma{
    int a;
    int b;

    /*Constructor*/
    /*Inicializa los atributos de nuestra clase.*/
    Suma(int a, int b){
        this.a = a;
        this.b = b;
    }
}
