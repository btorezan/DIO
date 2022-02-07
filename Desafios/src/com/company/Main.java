package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner leitor = new Scanner(System.in);
        double A = Double.parseDouble(leitor.next());
        double B = Double.parseDouble(leitor.next());
        //Escreva aqui a sua lógica


        double res = (((B - A)/A)*100);
        System.out.printf("%.2f%s", res, "%");
        }
    }
