package com.dio.br.desafios;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int quantNumeros ;
        int quantPares = 0;
        int quantImpar = 0;
        int contador = 0;

        System.out.printf("Quantos numeros terão?: ");
        quantNumeros = ler.nextInt();


        do {
            System.out.printf("Digite um numero: ");
            numero = ler.nextInt();
            if (numero % 2 ==0)quantPares++;
            else quantImpar++;

            contador++;
        }while (contador < quantNumeros);

        System.out.println("Pares: "+ quantPares);
        System.out.println("Impares: "+ quantImpar) ;




    }
}
