// Love Letter Mystery

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    public static boolean isPalindrome(String test){
        int len = test.length();
        for (int i = 0; i < len; ++i) {
            if (test.charAt(i) == test.charAt(len-1-i)) {
                if ( i == len-1-i){
                    break;
                }
            } else
                return false;
        } 
        return true;
    }
    public static char getBiggestCharacter(String value) {
        int highestCharacter = 0;
        for (int j = 0; j < len; ++j) { 
            int ascii_value = (int)value.charAt(i); 
            if (ascii_value > highestCharacter) {
                highestCharacter = ascii_value;
            }
        }
        return (char)highestCharacter;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        int count;
        for (int i = 0; i < cases; ++i) {
            String value = in.nextLine();

            count = 0;
            // first check if the string is a palindrom
            if (isPalindrome(value)){
                // System.out.println(value + " is a palindrome");
                System.out.println(count);
            } else
                System.out.println(value + " isn't a palindrome");
                int len = value.length();

                for ( int i = 0; i< len; ++i) {
                    for ( int j = 0; j < len; ++j) {
                        
                    }
                }

        }
        System.out.println("Got String: " + value);

    }

}
