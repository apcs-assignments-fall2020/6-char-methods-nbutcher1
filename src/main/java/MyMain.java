import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((int) ch > 64 && ch < 91) {
            ch += 32;
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((int) ch > 64 && ch < 91) {
                ch += 32;
             }
             newstr += ch;
        }
        return newstr;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if ((int) ch > 96  && ch < 123) {
            ch -= 32;
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((int) ch > 96  && ch < 123) {
                ch -= 32;
        }
             newstr += ch;
        }
        return newstr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        
    }
}
