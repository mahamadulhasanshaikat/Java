package firstjava;

import java.util.Scanner;

public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Input 5 digit number  : ");
        int a = sc.nextInt();
        
        int tremp,reverse = 0,r;
        
        tremp = a;
        
        while(tremp!=0){
        
        r = tremp %10;
        reverse = reverse*10+r;
        tremp = tremp / 10;
        
        }
        
        System.out.println(reverse);
        
        
    }    
}
