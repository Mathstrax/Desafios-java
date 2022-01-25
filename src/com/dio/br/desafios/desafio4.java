package com.dio.br.desafios;

import java.util.Scanner;


public class desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int media = 0;
        int maior = 0;

        for(int i = 0;i<5;i++){
            numero = ler.nextInt();
            media += numero;
            if (numero > maior) maior = numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media/5));
    }
}