package firstjava;

import java.util.Scanner;

public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Input number  : ");
        int a = sc.nextInt();
        
        if(a%2==0){
        
            System.out.println("Even");
            
        }else
        {
            System.out.println("Odd");
        }
        
    }    
}
