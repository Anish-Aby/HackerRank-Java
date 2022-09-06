package javaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        /* Making locale for India */
        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);

        NumberFormat india = NumberFormat.getCurrencyInstance(indiaLocale);

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Displaying the output */
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}