package javaLoopsI;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d",number,i,(number*i));
            System.out.println();
        }
    sc.close();
    }
}
