package com.dio.br.desafios;


import java.util.Scanner;

public class desafio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int Tabuada;

        System.out.printf("Tabuada: ");
        Tabuada = ler.nextInt();
        System.out.println("Tabuada do: " + Tabuada);
        if (Tabuada > 10) System.out.println("Valor inválido, apenas tabuada de 1 a 10: ");
        else for (int i = 1;i <= 10; i++) {
            System.out.println(Tabuada + " x " + i + " = " + (Tabuada*i));

        }


    }
}
