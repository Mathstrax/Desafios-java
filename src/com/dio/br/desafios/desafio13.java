package com.dio.br.desafios;

import java.util.Scanner;

public class desafio13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n1, n2,n3,n4,n5,media;
        String aluno;

            System.out.printf("Digite o nome do aluno: ");
            aluno = ler.next();
            System.out.printf("Digite sua nota de Português: ");
            n1 = ler.nextInt();
            System.out.printf("Digite sua nota de Historia: ");
            n2 = ler.nextInt();
            System.out.printf("Digite sua nota de Matemática: ");
            n3 = ler.nextInt();
            System.out.printf("Digite sua nota de Artes: ");
            n4 = ler.nextInt();
            System.out.printf("digite sua nota de Geografica: ");
            n5 = ler.nextInt();
            media = (n1+n2+n3+n4+n5)/5;
            System.out.println("A média do aluno " + aluno + " foi de "+ media);
    }
}
