package empleadosjosmerazocar;

public class EmpleadosJosmerAzocar {

    public static void main(String[] args) {
        
        Asalariado obj1 = new Asalariado(54848, "Pedro", "Gonzales", 545);
        obj1.imprimir();
        
        PorHoras obj2 = new PorHoras(41594, "Josmer", "Azocar", 45, 20, 10);
        obj2.imprimir();
        
        PorComision obj3 = new PorComision(57465, "Maria", "Perdomo", 100);
        obj3.imprimir();
        
        AsalariadoPorComision obj4 = new AsalariadoPorComision(43755, "Dani", "Smith", 100, 200);
        obj4.imprimir();
        
    }
    
}
