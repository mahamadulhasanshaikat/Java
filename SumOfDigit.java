package firstjava;

import java.util.Scanner;


public class FirstJava {


    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner (System.in);
        System.out.println("Input any number :");
        int num = sc.nextInt();

        if(num>0 && num<1000){


            int sum = 0,tem = num, r ;

        while(tem!=0){

            r = tem%10;
            sum = sum+r;
            tem = tem/10;  

        }

        System.out.println("Sum of :"+ sum);

        }else{



        System.out.println("Num is not range 0 to 1000");



        }
    }
}
