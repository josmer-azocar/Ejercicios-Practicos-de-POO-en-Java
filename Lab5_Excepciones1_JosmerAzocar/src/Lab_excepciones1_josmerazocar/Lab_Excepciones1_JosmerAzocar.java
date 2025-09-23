
package Lab_excepciones1_josmerazocar;

public class Lab_Excepciones1_JosmerAzocar {

    public static void main(String[] args) {
        
        try{
            Piscina objP = new Piscina(100);
            objP.llenar(101);
            objP.vaciar(50);
        } catch(CrearExc | LlenarExc | VaciarExc e) {
            System.out.println(e.getMessage());
        }
   
    }   
}
