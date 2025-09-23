
package EntradasJosmerAzocar;


public class EntradasJosmerAzocar {

 
    public static void main(String[] args) {
      
        Comprador obC = new Comprador("Josmer", "Azocar", 25, "Estudiante");
        
        Zona []arrayZ = new Zona [4];
        arrayZ[0] = new Zona ("Principal", 200, 35000, 4500);
        arrayZ[1] = new Zona ("Palco", 40, 5000, 1800);
        
        Entrada[]arrayE = new Entrada[3];
        arrayE[0] = new Normal(1, arrayZ[0], obC);
        arrayE[1] = new Reducida(2, arrayZ[1], obC);
        
        for (int i=0; i<2; i++){
            arrayE[i].imprimir();
            System.out.println("El precio a pagar: " + arrayE[i].calcPrecio());
        }
    }
    
}
