package Public;
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        String input;                                       //Create a variable to retrieve input.
        StringBuffer output = new StringBuffer();           //Create a variable to reverse input.
        Scanner in = new Scanner(System.in);
        System.out.println("Ange ett ord:");
        input = in.nextLine();                              //Retrieve input

        for (int i = input.length()-1; i >= 0; i-- ) {      //Reverse input.
            output.append(input.charAt(i));
        }
        System.out.println(output);                         // Check if input/output is equal.
        if (input.equals(output.toString())) {
            System.out.println("Ordet är ett Palindrom.");
        }else{
            System.out.println("Ordet är INTE ett Palindrom.");
        }
    }
}
