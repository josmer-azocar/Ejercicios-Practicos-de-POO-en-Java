
package lab7_josmerazocar_josueazocar;

public class CantanteFamoso implements Comparable<CantanteFamoso>{
    private String  nombre;
    private String discoMasVendido;
    private Integer anioEmision;
    private Integer duracionMinutos;

    public CantanteFamoso() {
        this.nombre = "";
        this.discoMasVendido = "";
        this.anioEmision = 0;
        this.duracionMinutos = 0;
    }
    
     public CantanteFamoso(String nombre, String discoMasVendido, Integer anioEmision, Integer duracionMinutos) {
        this.nombre = nombre;
        this.discoMasVendido = discoMasVendido;
        this.anioEmision = anioEmision;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoMasVendido() {
        return discoMasVendido;
    }

    public void setDiscoMasVendido(String discoMasVendido) {
        this.discoMasVendido = discoMasVendido;
    }

    public Integer getAnioEmision() {
        return anioEmision;
    }

    public void setAnioEmision(Integer anioEmision) {
        this.anioEmision = anioEmision;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "CantanteFamoso{" + "nombre = " + nombre + ", discoMasVendido= " + discoMasVendido + ", añoEmision= " + anioEmision + ", duracionMinutos= " + duracionMinutos + '}';
    }

    @Override
    public int compareTo(CantanteFamoso cantante) {
        return this.nombre.compareTo(cantante.getNombre());
    }
}
