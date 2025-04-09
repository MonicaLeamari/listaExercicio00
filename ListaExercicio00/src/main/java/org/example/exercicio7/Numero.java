package org.example.exercicio7;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        int numAntigo = num1;
        num1 = num2;
        num2 = numAntigo;

        System.out.println("Número 1: " + num1 + " Número 2: " + num2);
    }






}
