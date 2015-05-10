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
    public static char getCharFromIndex(String value, int index)
    {
        return value[index];
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

            // first check if the string is a palindrom
            if (isPalindrome(value)){
                // System.out.println(value + " is a palindrome");
                System.out.println(count);
            } else {
                System.out.println(value + " isn't a palindrome");
                int len = value.length();

                for(int j = 0; j < len; j++)
                {
                    // find the largest character
                    int greatestIndex = getBiggestCharacterIndex(value);

                    // 1. a b c <- find the index of the largest character
                    // while ascii value of index of largest character in string is greater than 97
                    int ascii_value = (int)getCharFromIndex(value, greatestIndex); 
                    while(ascii_value > 97)
                    {
                        replace(value, greatestIndex, convertCharacter(--ascii_value));
                        if(isPalindrome(value))
                            System.out.println(count);
                        count++;
                    }
                }
                
           }
        }
        System.out.println("Got String: " + value);

    }

}
