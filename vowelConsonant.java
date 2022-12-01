package firstjava;

import java.util.Scanner;




public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter a Alphabet : ");
        char num = sc.next().charAt(0);
        
        
        if(num== 'a'||num== 'e' || num== 'i' || num== 'o' ||num== 'u'|| num== 'A'||num== 'E' || num== 'I' || num== 'O' ||num== 'U'){
        
            System.out.println("The alphabet is vowl");
        
        
        }else{
            System.out.println("the alphaber is consolent");
        }
        
      

 }
}
