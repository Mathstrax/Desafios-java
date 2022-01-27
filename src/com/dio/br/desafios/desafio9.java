package com.dio.br.desafios;

import java.util.Scanner;

public class desafio9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int gols, gols1, m;

        System.out.printf("Quantos Gols o São paulo fez: ");
        gols1 = ler.nextInt();
        System.out.printf("Quantos Gols o Corinthians fez ");
        gols = ler.nextInt();
        m = Math.abs(gols-gols1);

        switch (m) {
            case 0:
                System.out.println("PARTIDA EMPATADA");
                break;
            case 1,2,3:
                System.out.println("PARTIDA NORMAL");
                break;
            case 4,5,6:
                System.out.println("GOLEADA");
                break;

            }

        System.out.println("Diferença de gols: " +  m);


       }

    }

