
package firstjava;

import java.util.Scanner;


public class FirstJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Base : ");
        double base = sc.nextDouble();
        System.out.println("Entere the Height :");
        double height = sc.nextDouble();
        
        double area = 0.5 * (base*height);
        
        System.out.println("Area of tringle :"+ area);
       
    
        
    }
}
    
