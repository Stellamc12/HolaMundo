/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;
import java.util.Scanner;
/**
 *
 * @author dani_
 */
public class HolaMundo {
    
    public static void main(String[] args) {
        int numero1, numero2;
        System.out.println("Proporciona el numero1:");
        Scanner teclado = new Scanner (System.in);
        numero1 = teclado.nextInt();
        System.out.println("Proporciona el numero2");
        numero2 = teclado.nextInt();
        System.out.println("El numero mayor es: ");
        System.out.println(numero1 > numero2 ? numero1 : numero2);
        
        
        
    }
}
