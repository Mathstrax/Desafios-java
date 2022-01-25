package com.dio.br.desafios;

import java.util.Scanner;

public class desafio14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double altPared , larguPared, altPiso,larPiso, qtd;

        altPared = 2;
        larguPared = 3.65;
        altPiso = 0.35;
        larPiso = 0.30;

        qtd = (altPared * larguPared) / (altPiso * larPiso);

        System.out.println("Quantidade de azulejos necessários para cobrir a parede: " + qtd);
    }
}
