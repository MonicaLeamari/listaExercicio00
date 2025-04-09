package org.example.exercicio11;

import java.util.Scanner;

public class Codigo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um código: ");
        double resposta = scanner.nextDouble();

        if (resposta == 001){
            System.out.println("001 ? Parafuso");
        }else if (resposta == 002){
            System.out.println("002 ? Porca");
        }else if (resposta == 003){
            System.out.println("003 ? Prego");
        }else {
            System.out.println("Código não existente");
        }


    }
}
