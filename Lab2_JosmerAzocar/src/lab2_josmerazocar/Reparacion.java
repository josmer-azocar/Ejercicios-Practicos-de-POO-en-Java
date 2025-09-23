
package lab2_josmerazocar;


public abstract class Reparacion extends Trabajo{
    
    protected double precioMaterial;


    public Reparacion() {
        super();
        precioMaterial = 0;
    }

    public Reparacion(String descripcion) {
        super(descripcion);
        precioMaterial=0;
    }
    
    
    public double getPrecioMaterial() {
        return precioMaterial;
    }

    public void setPrecioMaterial(double precioMaterial) {
        this.precioMaterial = precioMaterial;
    }
    
    @Override
     public void actualizar(){
        if(!super.estadoFinalizado) {
        System.out.println("Valores Actuales modificables:");
        System.out.println("1)Nro de horas trabajado: " + super.getNroHoras());
        System.out.println("2)Precio del material usado: " + this.getPrecioMaterial());
        System.out.println("3)Estado: " + super.isEstadoFinalizado()); 
        int opc = scanner.nextInt();
        switch(opc){
            case 1:
            System.out.println("Ingrese el numero de horas que trabajadas");
            int horas = scanner.nextInt();
            this.setNroHoras(horas);
            break;
            case 2:
                System.out.println("Ingrese el precio del material usado");
            double precio = scanner.nextDouble();
            this.setPrecioMaterial(precio);
            System.out.println("Operación exitosa");
                break;
            case 3:
             System.out.println("Se ha finalizado el trabajo? 1)si 2)no");
            int opcion = scanner.nextInt();
            if (opcion== 1){
              super.estadoFinalizado=true;
            }
            System.out.println("Operación exitosa");
            break;
            default:
            System.out.println("Opcion invalida");
            break;
        }
        } else{
                System.out.println("Este trabajo ya ha finalizado");
    }
    }

 
}
