package firstjava;

import java.util.Scanner;


public class FirstJava {


    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner (System.in);
        System.out.print("Calcius : ");
        double cal = sc.nextDouble();
        
        double farn = 9/5 * cal+32;
        
        System.out.println("Farenheit : "+farn);
        


        
    }
}
