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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();

        for (int i = 0; i < cases; ++i) {
            String value = in.nextLine();

            if (isPalindrome(value)){
                System.out.println(value + " is a palindrome");
            } else
                System.out.println(value + " isn't a palindrome");
                int len = value.length();

                for (int j = 0; j < len; ++j) { 

                }
                    // first check if the string is a palindrom

        }
        System.out.println("Got String: " + value);

    }

}
