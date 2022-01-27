package com.dio.br.desafios;

import java.util.Random;

public class desafio10 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = aleatorio.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }
            System.out.print("\nSucessores: ");
            for (int numero : numerosAleatorios) {
                System.out.print((numero + 1) + " ");


            }


        }
    }
