
package lab6_josmerazocar;

public class Elemento <E> {
    private String clave;
    private E objeto;

    public Elemento() {
        clave = "";
        objeto = null;
    }
       
    public Elemento(String clave, E objeto) {
        this.clave = clave;
        this.objeto = objeto;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public E getObjeto() {
        return objeto;
    }

    public void setObjeto(E objeto) {
        this.objeto = objeto;
    }


    public void imprimir() {
        System.out.println("Clave=" + clave + ", Objeto=" + objeto);
    }
    
    
    
}
