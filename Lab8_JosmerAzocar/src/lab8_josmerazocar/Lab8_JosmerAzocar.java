package lab8_josmerazocar;

public class Lab8_JosmerAzocar {
    
    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        Libro lib1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "c845");
        Libro lib2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 1605, "h924");
        Libro lib3 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, "b485");
        Libro lib4 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943, "z354");
        
        biblioteca.agregarLibro(lib1);
        biblioteca.agregarLibro(lib2);
        biblioteca.agregarLibro(lib3);
        biblioteca.agregarLibro(lib4);
        
        biblioteca.listarTodosLosLibros();
        biblioteca.listarLibrosOrdenadosPorAutor();
        
        biblioteca.eliminarLibroPorISBN("z354");
        
        biblioteca.listarLibrosOrdenadosPorAnioDescendente();
        biblioteca.listarLibrosOrdenadosPorIsbnDescendente();    
    }
    
}
