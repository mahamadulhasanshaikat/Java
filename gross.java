package firstjava;

import java.util.Scanner;

public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Input Basic Salary : ");
        double salary = sc.nextDouble();
        
        double House_rent = 0.3*salary;
        double madical = 0.05*salary;
        double tecnical = 1000;
        
        double gross = House_rent+madical+tecnical;
        
        System.out.println("Gross "+gross);
        
        
        
    }    
}
