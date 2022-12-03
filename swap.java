package firstjava;

import java.util.Scanner;




public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Input A : ");
        double a = sc.nextDouble();
        
       System.out.print("Input B : ");
        double b = sc.nextDouble();
        
        double tem =a;
        
        a=b;
        b=tem;
        System.out.println(a);
        System.out.println(b);
        
        
    }    
}
