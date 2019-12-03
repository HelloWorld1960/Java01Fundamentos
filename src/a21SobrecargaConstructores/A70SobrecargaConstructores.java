package a21SobrecargaConstructores;

/*@author Panzer01*/
public class A70SobrecargaConstructores {
    public static void main(String[] args) {
        //El constructor vacio es privado, por lo que nos obliga a 
        //utilizar el unico constructor publico y por lo tanto
        //proporcionar valores en los campos de nombre y edad

        A70Persona p1 = new A70Persona("Lilia", 22);
        System.out.println("Imprimimos el objeto p1");
        System.out.println(p1);

        //Creamos un nuevo objeto de tipo persona
        A70Persona p2 = new A70Persona("Juan", 33);
        System.out.println("\nImprimimos el objeto p2");
        System.out.println(p2);

        //Creamos un objeto empleado
        A70Empleado e1 = new A70Empleado("Pedro", 29, 18000);
        System.out.println("\nImprimimos el objeto e1");
        System.out.println(e1);
    }
}