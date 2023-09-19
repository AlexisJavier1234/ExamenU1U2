/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenu1u2;

import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class ExamenU1U2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
    
     Scanner lecturaDatos = new Scanner(System.in);
     System.out.println("Ingrese el nombre del producto1: ");
      String producto1 = new String();
     lecturaDatos.nextLine();
     System.out.println("ingrese cuanto cuesta el producto1:");
      double cuesta1= lecturaDatos.nextInt();
      lecturaDatos.nextLine();
    
     System.out.println("Ingrese el nombre del producto2: ");
      String producto2 = new String();
     lecturaDatos.nextLine();
     System.out.println("ingrese cuanto cuesta el producto2:");
      double cuesta2= lecturaDatos.nextInt();
      lecturaDatos.nextLine();
      
     System.out.println("Ingrese el nombre del producto3: ");
      String producto3 = new String();
     lecturaDatos.nextLine();
     System.out.println("ingrese cuanto cuesta el producto3:");
      double cuesta3= lecturaDatos.nextInt();
    lecturaDatos.nextLine();
    
    
    double precio1= cuesta1*30/100;
    double precio2= cuesta2*65/100;
    double precio3= cuesta3*15/100;
    
    System.out.println("El precio del primer producto es: "+precio1);
    
     System.out.println("El precio del segundo producto es: "+precio2);
     
     System.out.println("El precio del segundo producto es: "+precio3);
   
    }
     
}
