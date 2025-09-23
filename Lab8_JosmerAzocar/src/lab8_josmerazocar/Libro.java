package lab8_josmerazocar;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private String isbn;

      public Libro() {
        this.titulo = "";
        this.autor = "";
        this.anioPublicacion = 0;
        this.isbn = "";
    }
      
    public Libro(String titulo, String autor, int anioPublicacion, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + ", isbn=" + isbn + '}';
    }

    @Override
    public int compareTo(Libro t) {
        if (this.titulo.equals(t.getTitulo())){
            return this.anioPublicacion - t.anioPublicacion;
        }
       return this.titulo.compareTo(t.getTitulo());  
    }
    
}
