
package firstjava;

import java.util.Scanner;

public class OurMultiplication {
    
    
    public static void main(String[]args){
    
    
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 intigrt number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.print("Enter 3 double number : ");
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();
        
        
        System.out.println("Result of intiger number is : " + getValue(a,b,c));
        
        System.out.println("Result of double : " + getValue(d,e,f));
    
    
    
    
    }
    
    
    
    static int getValue(int x,int y,int z){
    
    
        return x*y*z;
        
    
    }
    
    
    static double getValue(double x, double y, double z){
    
    return x*y*z;
    
    }
    
    
    
    
}
