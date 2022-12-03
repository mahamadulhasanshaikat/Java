package firstjava;

import java.util.Scanner;




public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter first int number : ");
        int a = sc.nextInt();
        
        System.out.print("Enter secound int number : ");
        int b = sc.nextInt();
        
        
        int add = a+b;
        System.out.printf("The sum of two number is %d\n",add);
        
        int sub = a-b;
        System.out.printf("The subtraction two number is %d\n",sub);
        
        int mult = a*b;
        System.out.println("The multiplication two number is " +mult);
        
        double divi = a/b;
        System.out.println("The division two number is "+divi);
        
        double avg = (a+b)/2;
        System.out.println("The avarage two number is : "+ avg);
        
        
        
    }    
}
