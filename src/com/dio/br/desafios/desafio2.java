package com.dio.br.desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nota;

            while (true) { // estrutura de repetição
                System.out.printf("Digite sua nota de 0 à 10: ");
                nota = ler.nextInt();// guarda o valor da nota
                if (nota < 0 | nota > 10) { // se o usuario digitar um valor acima de 10 ou abaixo de 0 vai entrar no looping caso contrario o programa ira encerrar
                    System.out.printf("Nota invalida, por favor, ");
                } else {
                    break;
                }

        }
    }
}
