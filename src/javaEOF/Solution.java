package javaEOF; // Ignore this line.

import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        int i = 1;
        while(sc.hasNext()){
            System.out.println(i + " " + sc.nextLine());
            i++;
        }
        sc.close();
    }
}
