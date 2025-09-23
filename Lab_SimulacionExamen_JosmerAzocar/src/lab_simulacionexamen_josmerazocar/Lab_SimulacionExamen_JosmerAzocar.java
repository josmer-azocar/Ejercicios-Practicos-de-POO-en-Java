
package lab_simulacionexamen_josmerazocar;

public class Lab_SimulacionExamen_JosmerAzocar {

    public static void main(String[] args) {
  
        try{
        Conjunto<Fruta> CFrutas = new Conjunto<>(3);
        Conjunto<Bebida> CBebidas = new Conjunto<>(3);
        
        Fruta fruta1 = new Fruta(1, "manzana", 60);
        Fruta fruta2 = new Fruta(2, "pera", 80);
        Fruta fruta3 = new Fruta(3, "uva", 90);
        
        Bebida bebida1 = new Bebida(4, "refresco", 120);
        Bebida bebida2 = new Bebida(5, "agua", 20);
        Bebida bebida3 = new Bebida(6, "jugo", 55);
        
        CFrutas.nuevoElemento(fruta1);
        CFrutas.nuevoElemento(fruta2);
        CFrutas.nuevoElemento(fruta3);
        
        CBebidas.nuevoElemento(bebida1);
        CBebidas.nuevoElemento(bebida2);
        CBebidas.nuevoElemento(bebida3);
          
        System.out.println(CFrutas.unirConjunto(CBebidas));
        System.out.println(CFrutas.diferenciaConjuntos(CBebidas));
        System.out.println(CFrutas.productoCartesiano(CBebidas));
        
        //Solo se muestra el nombre de los productos para no hacerlo tan largo :)
        
        } catch (ExcConjunto e){
            System.out.println(e.getMessage());
        }
    }
    
}
