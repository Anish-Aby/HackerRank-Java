package JavaIfElse; // Ignore this line

/*Print "weird" if number is odd, print "Not weird" is number is even */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number%2;

        if(number%2==0){
            System.out.println("Not Weird");
        }
        else {
            System.out.println("Weird");
        }
        sc.close();
    }
}
