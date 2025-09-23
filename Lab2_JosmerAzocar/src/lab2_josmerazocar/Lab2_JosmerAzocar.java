
package lab2_josmerazocar;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab2_JosmerAzocar {
    
public static void limpiarPantalla() {
    for (int i = 0; i < 50; i++) {
        System.out.println();
    }
}
    public static void main(String[] args) {
        
        List<Trabajo> listaTrabajos = new ArrayList<>();
        int opc;
        String descrip;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("Qué desea Realizar?");
            System.out.println("1)Registrar");
            System.out.println("2)Consultar");
            System.out.println("3)Actualizar");
            System.out.println("4)Salir");
            opc = scanner.nextInt();
            
            switch(opc){
                case 1: 
                limpiarPantalla();
                System.out.println("Elija una opción");
                System.out.println("1)Reparación mecánica");
                System.out.println("2)Reparación de Chapa y Pintura");
                System.out.println("3)Revisión");
                int opc2 = scanner.nextInt();
                scanner.nextLine();
                
            switch (opc2) {
                case 1:
                    System.out.println("Ingrese la descripción del trabajo");
                    descrip = scanner.nextLine();
                    listaTrabajos.add(new Mecanica(descrip));
                    System.out.println("Se ha registrado su Reparacion mecánica con exito!!!");
                    break;
                case 2:
                    System.out.println("Ingrese la descripción del trabajo");
                    descrip = scanner.nextLine();
                    listaTrabajos.add(new ChapaPintura(descrip));
                    System.out.println("Se ha registrado su Reparación de Chapa y Pintura con exito!!!");
                    break;
                case 3:
                    System.out.println("Ingrese la descripción del trabajo");
                    descrip = scanner.nextLine();
                    listaTrabajos.add(new Revision(descrip));
                    System.out.println("Se ha registrado su Revisión con exito!!!");
                    break;
                default:
                System.out.println("Opción no valida");
                    break;
            }
             break;
             
                    case 2:
                     limpiarPantalla();

                     if (listaTrabajos.isEmpty()) {
                         System.out.println("No hay trabajos registrados");
                     } else {
                         for (Trabajo trabajo : listaTrabajos) {
                             trabajo.consultar();
                             System.out.println("///////////////////////////");
                         }
                     }
                     break;

                
                case 3:
                 limpiarPantalla();
                    System.out.println("Ingrese la identificación del trabajo que desea actualizar:");
                      int codigo = scanner.nextInt();
                      scanner.nextLine(); 

                        boolean encontrado = false;

                        for (Trabajo trabajo : listaTrabajos) {
                            if (trabajo.getIdentificador() == codigo) {
                                trabajo.actualizar();
                                encontrado = true;
                                break; 
                            }
                        }
                        if (!encontrado) {
                            System.out.println("No se encontró un trabajo con el identificador proporcionado");
                        }
                        break;
                        
                case 4:
                limpiarPantalla();
                System.out.println("Hasta luego");
                break;
  
             default:
                System.out.println("Opción no valida");
                break;        
                
  
    }
       
        }while(opc!=4);
        
      scanner.close();
    }
  
}
