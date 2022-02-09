package br.com.torezan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        double x =  Double.parseDouble(sc.next());
        System.out.printf("%+1.4E\n", x);     // 1E10

        sc.close();
    }
}
