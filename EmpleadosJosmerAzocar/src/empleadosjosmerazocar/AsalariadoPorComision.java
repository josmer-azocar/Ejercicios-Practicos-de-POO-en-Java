package empleadosjosmerazocar;

public class AsalariadoPorComision extends PorComision{   
    double salario;

    public AsalariadoPorComision() {
        super();
        this.salario = 0;
    }

    public AsalariadoPorComision(int numSS, String nombre, String apellido, int ventas, double salario) {
        super(numSS, nombre, apellido, ventas);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    @Override
    public void imprimir(){
          super.imprimir();
        System.out.println("Salario base: " + salario);
    }
    
    @Override
   public double calcularSalario(){
       return (super.calcularSalario() + this.salario);
   }
}
