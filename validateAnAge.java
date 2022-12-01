package firstjava;

import java.util.Scanner;




public class FirstJava {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner myInput = new Scanner(System.in);

System.out.print("Please enter age: ");

int inum = myInput.nextInt();


if(inum<18){

while (inum < 18)

{

System.out.print("Age must be 18 or over, please re-enter: ");

inum = myInput.nextInt();

  } 

}else
{

    System.out.println("Age its not valid ");
}

 }
}
