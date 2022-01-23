package com.dio.br.desafios;

import java.util.Scanner;
public class desafio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int L = sc.nextInt();
        System.out.println("digite o outro numero: ");
        int C = sc.nextInt();
        if (( L %  C  )  ==0 ) {
            System.out.println(1);
        } else                                               //complete o código nos espaços em branco
            System.out.println(0);
        sc.close();
    }
}