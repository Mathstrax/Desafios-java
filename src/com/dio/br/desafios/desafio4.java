package com.dio.br.desafios;

import java.util.Scanner;
// Tenho muita dificultade com esse exercicio
public class desafio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int limite = 0;
        int maior = 0;
        double media = 0;
        do {
            System.out.printf("Digite o numero: ");
            numero = ler.nextInt();
            media = media+numero;
            if (numero > maior) maior = numero;
            limite = ++limite;

        } while (limite < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + (media/5));
    }
}
