package labl_josmerazocar;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Labl_JosmerAzocar {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
/*
        Personaje obj1 = new Personaje();
        obj1.setNombre("Potter");
        obj1.setRaza("Humano");
        obj1.setFuerza(15);
        obj1.setInteligencia(15);
        obj1.imprimir();
  */      

        JOptionPane.showMessageDialog(null, "Ingresa el nombre del primer Mago");
        String nombre = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la raza del primer Mago");
        String raza = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la fuerza del primer Mago (0-15)");
        int fuerza = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la inteligencia del primer Mago (17-20)");
        int inteligencia = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la vida máxima del primer Mago (0-100)");
        int vidaMaxima = scanner.nextInt(); 
        Mago magoA = new Mago(nombre, raza, fuerza, inteligencia, vidaMaxima);

        JOptionPane.showMessageDialog(null, "Ingresa el nombre del segundo Mago");
        nombre = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la raza del segundo Mago");
        raza = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la fuerza del segundo Mago (0-15)");
        fuerza = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la inteligencia del segundo Mago (17-20)");
        inteligencia = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la vida máxima del segundo Mago (0-100)");
        vidaMaxima = scanner.nextInt(); 
        Mago magoB = new Mago(nombre, raza, fuerza, inteligencia, vidaMaxima);

        JOptionPane.showMessageDialog(null, "Ingresa el nombre del Clérigo");
        nombre = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la raza del Clérigo");
        raza = scanner.next();
        JOptionPane.showMessageDialog(null, "Ingresa la fuerza del Clérigo (18-20)");
        fuerza = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la inteligencia del Clérigo (12-16)");
        inteligencia = scanner.nextInt();
        JOptionPane.showMessageDialog(null, "Ingresa la vida máxima del Clérigo (0-100)");
        vidaMaxima = scanner.nextInt(); 
        JOptionPane.showMessageDialog(null, "Ingresa el nombre del dios del Clérigo");
        String nDios = scanner.next(); 
        Clerigo cleriC = new Clerigo(nombre, raza, fuerza, inteligencia, vidaMaxima, nDios);
        
        magoA.imprimir();
        magoB.imprimir();
        cleriC.imprimir();
               
        magoA.aprendeHechizo("Lanza Fuego");
        magoA.aprendeHechizo("Expecto Patronum");
        
        magoB.aprendeHechizo("Dragon Electrico");

        magoA.imprimir();
        magoB.imprimir();
        
        magoA.lanzarHechizo(magoB, "Lanza Fuego");
        magoB.lanzarHechizo(magoA, "Dragon Electrico");
        
        cleriC.rezar();
        cleriC.curar(magoB);
        
        magoA.lanzarHechizo(magoB, "Expecto Patronum");
        
        magoA.imprimir();
        magoB.imprimir();
        cleriC.imprimir();
        
        scanner.close();
    }    
}
