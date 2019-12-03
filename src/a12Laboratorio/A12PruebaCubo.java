package a12Laboratorio;

/*@author Panzer01*/
public class A12PruebaCubo {
    public static void main(String args[]) {
        //Variables locales
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;

        //Constructor sin argumentos
        A12Cubo caja1 = new A12Cubo();
        int resultado = caja1.calcularVolumen(medidaAncho, medidaAlto, medidaProf);

        System.out.println("resultado de caja 1:" + resultado);

        //Constructor con argumentos
        A12Cubo caja2 = new A12Cubo(2, 4, 6);
        System.out.println("resultado de caja 2:" + caja2.calcularVolumen());
    }
}
