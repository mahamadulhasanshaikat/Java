package firstjava;

import java.util.Scanner;




public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter The Year :");
        int year = sc.nextInt();
        
        
        
         if(((year%4==0) && ((year%400==0) || (year%100!= 0))))
        {

            System.out.printf("%d Is a leap Year\n", year);
        }else
        {
            System.out.printf("%d Is not a leap year\n", year);
        }


 }
}
