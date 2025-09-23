
package lab_excepciones1_josmerazocar;

public class Vector {
   
    private int[] componentes;

    public Vector() {
        componentes = new int[0];
    }

    public Vector(int dimension) throws CrearVectorExc {
        if (dimension <= 0) {
            throw new CrearVectorExc("Error: La dimension del vector no puede ser negativa o cero.");
        }
        componentes = new int[dimension];
    }
    
    public int getDimension() {
        return componentes.length;
    }

    public int[] getComponentes() {
        return componentes;
    }
    
     public void setComponentes(int[] componentes) {
        this.componentes = componentes;
    }

    public void cambiaComponente(int pos, int valor) throws ComponenteExc {
        if (pos < 0 || pos >= componentes.length) {
            throw new ComponenteExc("Error: indice " + pos + " fuera de los limites del vector");
        }
        componentes[pos] = valor;
    }

    public Vector Suma(Vector otroVector) throws SumaExc, CrearVectorExc, ComponenteExc {
        if (this.getDimension() != otroVector.getDimension()) {
            throw new SumaExc("Error: los vectores no tienen la misma dimension");
        }
        
        Vector vectorResultado = new Vector(this.getDimension());
        for (int i = 0; i < this.getDimension(); i++) {
            int valorSuma = this.componentes[i] + otroVector.componentes[i];
            vectorResultado.cambiaComponente(i, valorSuma);
        }
        return vectorResultado;
    }

    public void Acumula(Vector otroVector) throws AcumulaExc {
        if (this.getDimension() != otroVector.getDimension()) {
            throw new AcumulaExc("Error: los vectores no tienen la misma dimension");
        }

        for (int i = 0; i < this.getDimension(); i++) {
            this.componentes[i] += otroVector.componentes[i];
        }
    }

    public void imprimir() {
        System.out.print("(");
        for (int i = 0; i < componentes.length; i++) {
            System.out.print(componentes[i]);
            if (i < componentes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    } 
}
