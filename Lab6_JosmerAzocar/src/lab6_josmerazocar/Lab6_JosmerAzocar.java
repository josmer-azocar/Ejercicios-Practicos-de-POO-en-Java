
package lab6_josmerazocar;


public class Lab6_JosmerAzocar {


    public static void main(String[] args) {
     
        Elemento e1 = new Elemento("0555", "hola");
        Elemento e2 = new Elemento("0845", "hello");
        
        Elemento e3 = new Elemento("0555", "adios");
        Elemento e4 = new Elemento("0846", "bye");
        try{
            
        Almacen a1 = new Almacen(4);
        a1.ingresar(e1);
        a1.ingresar(e2);
        a1.sacar("0845");
        
        Almacen a2 = new Almacen(3);
        a2.ingresar(e3);
        a2.ingresar(e4);      
        a2.ingresar(e1);
         
        a1.imprimir();
        a2.imprimir();
        
        Almacen.informaciongeneral();
        
        } catch(AlmacenExc e){
            System.out.print(e.getMessage());
        }
    }
    
}
