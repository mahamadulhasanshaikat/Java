package firstjava;

import java.util.Scanner;


public class FirstJava {


   public static double price,tax;
    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner (System.in);
        System.out.print("Product price : ");
        price = sc.nextDouble();
        System.out.print("Tax rate : ");
        tax = sc.nextDouble();
        
        System.out.println("Price is : "+addTax());
        
        
    }
    
    
    public static double addTax(){
    
    price = price * (1 + tax/100);
    
    return price;
        
    }
}
