/*
 *  Sample test cases are
 *  5 6
 *  3
 *
 *  1 10
 *  15
 */
import java.io.*;
import java.util.*;
public class maximizing_xor {
    
    public static int obtainXor(int a, int b){
        return a ^ b;
    }
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        
        int min = -1;
        for (int i = first; i < second; ++i )
        {
            for (int j = i; j <= second; ++j)
            {    
               int xor_value = obtainXor(i,j); 
               // Debugging...
               System.out.println(i + " ^ " + j + " = " + xor_value);
               if ( min < xor_value ){
                   min = xor_value;
               } 
            }
        }
        System.out.println(min);
        
    }
}
