package a18Encapsulamiento;

/*@author Panzer01*/
public class A61Encapsulamiento {
    public static void main(String[] args) {
        //Creamos el objeto
        A61Persona p1 = new A61Persona("Juan","Perez",false);
        //Accedemos al atributo nombre.
        System.out.println("Nombre de p1: " + p1.getNombre());
        
       //Creamos el objeto
        A61Persona p2 = new A61Persona("Karla","Gonzalez",false);
        //Imprimimos el estado completo del objeto
        //Con solo poner p2, llamamos al metodo toString
        System.out.println("Estado objeto p2:" + p2);        
        
        //Marcamos como elminada a la persona
        p2.setBorrado(true);
        //Imprimimos el estado completo del objeto
        //Con solo poner p2, llamamos al metodo toString
        System.out.println("Estado objeto p2:" + p2);     
        
        //Creamos un tercer objeto vacio
        A61Persona p3 = new A61Persona();
        //Imprimimos el estado completo del objeto
        //Con solo poner p3, llamamos al metodo toString
        System.out.println("Estado objeto p3:" + p3);       
    }
}