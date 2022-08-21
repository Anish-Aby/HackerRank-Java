package javaDatatypes; // Don't include this line...

import java.io.*;
import java.lang.Math;
import java.util.*;

/* Question:
* Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

A byte is an 8-bit signed integer.
A short is a 16-bit signed integer.
An int is a 32-bit signed integer.
A long is a 64-bit signed integer.
Given an input integer, you must determine which primitive data types are capable of properly storing that input.
*
* Sample Input

5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
*
*
* Sample Output

-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long*/


public class Solution {

    public static void main(String[] args) {
        int testCases; // Counts the number of test cases for the loop.
        Scanner sc = new Scanner(System.in); // Making a Scanner object to read input from console.
        testCases = sc.nextInt();

        for(int i = 0; i < testCases; i++){
            try{
                long input = sc.nextLong();
                System.out.println(input+" can be fitted in:");
                if(input>=-128 && input<=127) System.out.println("* byte");
                if(input >= -32768 && input <= 32767) System.out.println("* short");
                if(input >= (Math.pow(-2,31)) && input <= (Math.pow(2,31)-1)) System.out.println("* int");
                if(input >= (Math.pow(-2,63)) && input <= (Math.pow(2,63)-1)) System.out.println("* long");
            }
            catch (Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
