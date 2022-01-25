package com.dio.br.desafios;

import java.util.Scanner;

public class desafio12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double Fahrenheit,Kelvin,Reaumur,Rankine;
        double Celsius;
        System.out.printf("Quantos graus está fazendo hoje: ");
        Celsius = ler.nextInt();
        System.out.println("Em Fahrenheit seria: " + (Celsius*1.8+32));
        System.out.println("Em Kelvin seria: " + (Celsius+273.15));
        System.out.println("Em Reaumur seria: " + (Celsius*0.8));
        System.out.println("Em Rankine seria: " + (Celsius*1.8+32+459.67));
    }
}
