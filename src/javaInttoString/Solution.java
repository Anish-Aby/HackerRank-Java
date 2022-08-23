package javaInttoString;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        try {
            String string = Integer.toString(number);
            System.out.println("Good job");
        }
        catch (Exception e){
            System.out.println("Wrong answer");
        }
    }
}
