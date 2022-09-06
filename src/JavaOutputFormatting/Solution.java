package JavaOutputFormatting;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String text = sc.next();
            int number = sc.nextInt();
            System.out.printf("%-15s", text);
            System.out.printf("%03d", number);
            System.out.println();
        }
        System.out.println("================================");
        sc.close();
    }
}
