package javaLoopsII;

/**/

import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int result = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j = 0; j < n; j++){
                result += (Math.pow(2,j) * b );
                System.out.print(result + a + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
