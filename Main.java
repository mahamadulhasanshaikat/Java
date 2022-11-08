import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Name: ");
        String a = sc.nextLine();

        System.out.println("Total Number of Vowels in this line "+ countVowel(a));


    }


    public static int countVowel(String a){

        int Count = 0;

        for (int i = 0; i < a.length(); i++ ){

            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){

                Count ++;

            }

        }

        return Count;

    }

}