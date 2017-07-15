import java.util.Scanner;

/**
 * Created by Zakir on 7/14/17.
 */
public class ReverseString {

    public String reverseEverything(String s){

        String reverseString = "";

        char[] chars = s.toCharArray();

        for (int i = chars.length-1; i >=0; i-- ){
            reverseString = reverseString + chars[i];
        }
        return reverseString;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String str = scan.nextLine();

        ReverseString reversedString = new ReverseString();

        String reverseStr = reversedString.reverseEverything(str);


        System.out.println("Reverse String: " + reverseStr);

    }
}
