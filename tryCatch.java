package firstjava;

import java.util.Scanner;

public class FirstJava {
 
    public static void main(String[] args) {
        // TODO code application logic here

  try{
        Dog labrador = new Dog();
               
        labrador.eat();
        labrador.bark();
        
  }catch(Exception e){
  
  
      System.out.println(e);
  
  
  }
    
    }    
}

//-----------------------------------

package firstjava;


public class Animal {
    
 
    
    public void eat(){
    
    
        System.out.println("I can eat");
        
    }
    
}

//----------------------------------

package firstjava;


public class Dog extends Animal{
    
    
    @Override
   public void eat(){
    
        System.out.println("I can dog food");
    
    
    }
    
    void bark(){
    
    
        System.out.println("I can bark");
        
    }
    
    
    
    
    
}

