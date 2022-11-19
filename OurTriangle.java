package firstjava;

import java.util.Scanner;




   class OurTriangle {
    
    
    public double a,b,c,s;
    
    
    OurTriangle(double a, double b, double c)
    {
    
        this.a = a;
        this.b = b;
        this.c = c;
    
    }
    
    
       
    public double getArea(){
        
        s = (a + b + c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));        
    }
    
    
    double getPerimeter()
    {
    
        return a+b+c;
    
    }
    
}




public class FirstJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner se = new Scanner(System.in);
        
        System.out.print("Input a : ");
        double a = se.nextDouble();
        
        System.out.print("Input b : ");
        double b = se.nextDouble();
        
        System.out.print("Input c : ");
        double c = se.nextDouble();
        
        OurTriangle sc = new OurTriangle(a,b,c);
        
        
        
        System.out.println(" Area "+sc.getArea());
        
        System.out.println("Peremiter "+sc.getPerimeter());
        
        
        
    }
    
}
