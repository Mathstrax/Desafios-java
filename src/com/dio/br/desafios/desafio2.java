package com.dio.br.desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senha = leitor.nextInt();
        while (senha != 2002) {
            System.out.println("senha invalida");
            senha = leitor.nextInt();
        }
        System.out.println("acesso permitido");




        }
    }

// 1222
//2002222
//2001
//2222
//2002