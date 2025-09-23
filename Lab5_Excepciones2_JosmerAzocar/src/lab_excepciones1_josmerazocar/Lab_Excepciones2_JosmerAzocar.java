
package lab_excepciones1_josmerazocar;

public class Lab_Excepciones2_JosmerAzocar {

    public static void main(String[] args){
        
        try {
            System.out.println("Operaciones:");
            Vector v3a = new Vector(3);
            v3a.cambiaComponente(0, 1); 
            v3a.cambiaComponente(1, 2);
            v3a.cambiaComponente(2, 3);
            System.out.print("Vector v3a creado:");
            v3a.imprimir();

            Vector v3b = new Vector(3);
            v3b.cambiaComponente(0, 10); 
            v3b.cambiaComponente(1, 20);
            v3b.cambiaComponente(2, 30); 
            System.out.print("Vector v3b creado:");
            v3b.imprimir();

            // Suma
            Vector vSuma = v3a.Suma(v3b);
            System.out.print("Resultado Suma:");
            vSuma.imprimir();

            // Acumula
            v3a.Acumula(v3b);
            System.out.print("Valor de v3a despues de acumular:");
            v3a.imprimir();
            
            System.out.println("\nerror de creacion:");
            new Vector(-5);

        } catch (CrearVectorExc | SumaExc | AcumulaExc | ComponenteExc e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("\nerror de indice invalido:");
            Vector v = new Vector(2);
            v.cambiaComponente(2, 99);
            
        } catch (CrearVectorExc | ComponenteExc e) {
            System.out.println(e.getMessage());
        }

        try {
            
            System.out.println("\nerror de suma con dimensiones distintas:");
            Vector v3 = new Vector(3);
            Vector v4 = new Vector(4);
            v3.Suma(v4);

        } catch (CrearVectorExc | SumaExc | ComponenteExc e) {
            System.out.println(e.getMessage());
        }
    }
    
}
