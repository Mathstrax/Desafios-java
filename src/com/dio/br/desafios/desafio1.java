package com.dio.br.desafios;

import java.util.Scanner;

public class desafio1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        int idade;
        while (true) { // estrutura de repetição while , recebendo true
            System.out.printf("Digite seu nome: ");
            nome = ler.next();
            if (nome.equals("0")) { //
                break;
            }
            System.out.printf("Digite sua idade: ");
            idade = ler.nextInt();
           /* if (idade == 0) { // se idade for estritamente igual a 0 pare o programa
                break;
            }*/
            System.out.print("");
        }
        System.out.println("continua aqui ... ");
    }

}
