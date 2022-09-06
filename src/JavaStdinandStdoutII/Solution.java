package JavaStdinandStdoutII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        double doubleNumber = sc.nextDouble();
        sc.nextLine(); // Doing this to ignore the new line. Doing this helps us
                       // to read the string.
        String newString = sc.nextLine();
        sc.close();

        System.out.println("String: " + newString);
        System.out.println("Double: " + doubleNumber);
        System.out.println("Int: " + number);
    }
}
