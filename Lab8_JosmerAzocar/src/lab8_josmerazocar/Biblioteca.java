package lab8_josmerazocar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Biblioteca {
    private List<Libro> listaLibros;

    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
    }
   
    public void agregarLibro(Libro libro){
     if (libro != null){
     boolean identificadorEncontrado=false;
        for (Libro l: listaLibros){
            if (libro.getIsbn().equals(l.getIsbn()))
                identificadorEncontrado=true;
            break;
        }
        
        if (identificadorEncontrado)
        System.out.println("Error: Un libro con ese identificador ya existe");
        
        if (!identificadorEncontrado){
         listaLibros.add(libro);    
          System.out.println("Libro agregado con exito");
        } 
        } else  System.out.println("Libro no valido");    
    }
    
    public List buscarLibroPorTitulo(String titulo){
       List<Libro> listAux = new ArrayList<>();
        for (Libro l: listaLibros){
           if (l != null && l.getTitulo() != null) {
               
            if (l.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
             listAux.add(l);
        }
       }
        if (listAux.isEmpty()){
           System.out.println("No se ha encontrado ningun libro");
        }
        
       return listAux; 
    }
    
    public boolean eliminarLibroPorISBN(String isbn){
        boolean libroEliminado = false;
        if (isbn != null){
          for (Libro l: listaLibros){
            if (l != null && l.getIsbn().equals(isbn)){
                listaLibros.remove(l);
                libroEliminado=true;
                System.out.println("\nLibro eliminado");
            break;
       }
    }  
        if (!libroEliminado){
               System.out.println("Libro no encontrado");
        }
    } else {System.out.println("isbn no valido");}
        return libroEliminado;
    }

    public void listarTodosLosLibros(){
         System.out.println("\nLista por orden Natural (Titulo o Año):");
         Collections.sort(listaLibros);
         for (Libro l: listaLibros){
            if (l != null){
                System.out.println(l.toString());
            }
        }
    }
     public void listarLibrosOrdenadosPorAutor(){
         System.out.println("\nLista por orden Alfabetico por Autor:");
         Collections.sort(listaLibros, new ComparadorAutor());
         for (Libro l: listaLibros){
            if (l != null){
                System.out.println(l.toString());
            }
        }
    }   
       public void listarLibrosOrdenadosPorAnioDescendente(){
         System.out.println("\nLista por ordenadas por Año de Forma Descendente:");
         Collections.sort(listaLibros, new ComparadorAnioDesc());
         for (Libro l: listaLibros){
            if (l != null){
                System.out.println(l.toString());
            }
        }
    }  
    
       public void listarLibrosOrdenadosPorIsbnDescendente(){
         System.out.println("\nLista por ordenadas por Isbn de Forma Descendente:");
         Collections.sort(listaLibros, new ComparadorIsbnDesc());
         for (Libro l: listaLibros){
            if (l != null){
                System.out.println(l.toString());
            }
        }
    } 
}