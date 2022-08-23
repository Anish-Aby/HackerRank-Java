package javaStaticInitializerBlock;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int b, h;
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        if(b <= 0 || h <= 0) System.out.println("java.lang.Exception: Breadth and height must be positive");
        else System.out.println(b*h);
    }
}