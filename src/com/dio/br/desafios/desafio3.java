package com.dio.br.desafios;

import java.util.Scanner;
/* Uma maneira mais simples de resolver o desafio sem precisar de if */
public class desafio3 {
    public static void main(String[] args) {
        int nota;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a nota:");
        nota = ler.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota invalida! Digite novamente:");
            nota = ler.nextInt();
       }
    }
}
