package com.dio.br.desafios;

public class desafio8 {
    public static void main(String[] args) {
        int [] vetor = {0, 27, 30, 50, 8, -4};


        System.out.printf("Vetor: " );

        int contador = 0;
        while (contador <= vetor.length -1) {
            System.out.print(vetor[contador] + " ");
            contador++;
        }
        System.out.printf("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] +  " ");

        }


    }
}
