package lab7_josmerazocar_josueazocar;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab7_JosmerAzocar_JosueAzocar {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ListaCantantesFamosos lista = new ListaCantantesFamosos();
        boolean salir = false;  
        
        try {
                     
            CantanteFamoso cantante1 = new CantanteFamoso("Jorge Negrete", "Jalisco", 1941, 35);
            CantanteFamoso cantante2 = new CantanteFamoso("Madonna", "All I want is you", 1990, 50);
            lista.agregarCantante(cantante1);
            lista.agregarCantante(cantante2);
    
            while (!salir) {
                System.out.println("\n1. Agregar cantante");
                System.out.println("2. Mostrar listado de cantantes");
                System.out.println("3. Eliminar cantante por nombre");
                System.out.println("4. Buscar cantante");
                System.out.println("5. Ordenar la lista");
                System.out.println("6. Eliminar todos los cantantes de la lista");
                System.out.println("7. Salir");
                System.out.print("Seleccione una opcion: ");

                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        String nombre;
                        while (true) {
                            System.out.print("Nombre del cantante: ");
                            nombre = scanner.nextLine().trim();
                            if (!nombre.isEmpty()) {
                                break;
                            }
                            System.out.println("Error: El nombre no puede estar vacio. Intentelo de nuevo");
                        }

                        String disco;
                        while (true) {
                            System.out.print("Disco con mas ventas: ");
                            disco = scanner.nextLine().trim();
                            if (!disco.isEmpty()) {
                                break;
                            }
                            System.out.println("Error: El nombre del disco no puede estar vacio. Intentelo de nuevo");
                        }

                        int anio;
                        while (true) {
                            try {
                                System.out.print("Año de emision: ");
                                anio = scanner.nextInt();
                                if (anio >= 1900 && anio <= 2025) {
                                    break;
                                } else {
                                    System.out.println("Error: El año debe ser un numero valido (ej: 1900-2025). Intentelo de nuevo");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Debes introducir un numero entero. Intentelo de nuevo");
                                scanner.nextLine();
                            }
                        }

                        int duracion;
                        while (true) {
                            try {
                                System.out.print("Duracion del disco (minutos): ");
                                duracion = scanner.nextInt();
                                if (duracion > 0) {
                                    break;
                                } else {
                                    System.out.println("Error: La duracion debe ser un numero positivo. Intentelo de nuevo");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: Debes introducir un numero entero. Intentelo de nuevo");
                                scanner.nextLine();
                            }
                        }
                        scanner.nextLine(); 

                        CantanteFamoso nuevoCantante = new CantanteFamoso(nombre, disco, anio, duracion);
                        lista.agregarCantante(nuevoCantante);
                        System.out.println("Cantante agregado exitosamente");
                        lista.mostrarTodosLosCantantes();
                        break;

                    case 2:
                        lista.mostrarTodosLosCantantes();
                        break;

                    case 3:
                        System.out.print("Introduce el nombre completo del cantante a eliminar: ");
                        String nombreEliminar = scanner.nextLine();
                        lista.eliminarPorNombre(nombreEliminar);
                        break;

                    case 4:
                        System.out.println("1. Buscar por nombre de cantante");
                        System.out.println("2. Buscar por parte del nombre del disco");
                        System.out.print("Elige una opcion: ");
                        int opcBusqueda = scanner.nextInt();
                        scanner.nextLine(); 
                        
                        if (opcBusqueda == 1) {
                            System.out.print("Introduce el nombre del cantante a buscar: ");
                            String nombreBuscar = scanner.nextLine();
                            lista.buscarPorNombre(nombreBuscar);
                        } else if (opcBusqueda == 2) {
                            System.out.print("Introduce una palabra del nombre del disco: ");
                            String discoBuscar = scanner.nextLine();
                            lista.buscarPorDisco(discoBuscar);
                        } else {
                            System.out.println("Opcion no valida");
                        }
                        break;
                    
                    case 5:
                        System.out.println("1. Por nombre de cantante");
                        System.out.println("2. Por nombre del disco");
                        System.out.println("3. Por año de emision");
                        System.out.print("Elige una opcion: ");
                        int opcOrdenar = scanner.nextInt();
                        scanner.nextLine(); 

                        switch (opcOrdenar) {
                            case 1:
                                Collections.sort(lista.getLista());
                                System.out.println("Lista ordenada por nombre");
                                break;
                            case 2:
                                Collections.sort(lista.getLista(), new ComparadorPorDisco());
                                System.out.println("Lista ordenada por disco");
                                break;
                            case 3:
                                Collections.sort(lista.getLista(), new ComparadorPorAnio());
                                System.out.println("Lista ordenada por año de emision");
                                break;
                            default:
                                System.out.println("Opcion no valida.");
                                break;
                        }
                        lista.mostrarTodosLosCantantes();
                        break;

                    case 6:
                        lista.eliminarTodosLosCantantes();
                        break;
                        
                     case 7:
                        salir = true;
                        System.out.println("Hasta luego");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } catch (ListaCantanteExc e) {
            System.out.println(e.getMessage());
        }
    }
}
