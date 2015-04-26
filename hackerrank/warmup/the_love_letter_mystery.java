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
    public static int getBiggestCharacterIndex(String value) {
        int highestCharacter = 0;
        for (int j = 0; j < len; ++j) { 
            int ascii_value = (int)value.charAt(i); 
            if (ascii_value > highestCharacter) {
                highestCharacter = j;
            }
        }
        return highestCharacter;
    }

    // helper functions
    public static int getCharacter(char c) {
        return (int)c;
    }
    public static char convertCharacter(int i){
        return (char)i;
    }
    public static String replace(String str, int index, char value){
        char[] tmp = str.toCharArray();
        tmp[index] = value;
        return String.valueOf(tmp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        int count;
        for (int i = 0; i < cases; ++i) {
            String value = in.nextLine();
            String original_value = value;

            count = 0;
            // first check if the string is a palindrom
            if (isPalindrome(value)){
                // System.out.println(value + " is a palindrome");
                System.out.println(count);
            } else {
                System.out.println(value + " isn't a palindrome");
                int len = value.length();

                // find the largest character
                int index = getBiggestCharacterIndex(value);
                
                /* reduce it */

                // convert index to a character
                char c = convertCharacter(index)
                // convert character to ascii value

                // reduce ascii value by one
                
                // convert reduced ascii value back to character
                // assign character to value[index]
                
                //value[index] = value.charAt(index)--;
                
                // check if palindrome 
                // increment count by one
                // repeat
               
                
                while(index >= 97)
                {
               }
            }
        }
        System.out.println("Got String: " + value);

    }

}
