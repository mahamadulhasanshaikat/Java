package firstjava;

import java.util.Scanner;


public class FirstJava {


    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner (System.in);
        System.out.print("Fahrenheit : ");
        double farn = sc.nextDouble();
        
        double cel = 5/9 * farn-32;
        
        System.out.println("Celcius : "+cel);
        


        
    }
}
