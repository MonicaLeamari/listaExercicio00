package org.example.exercicio15;

public class MediaDois {
    public static void main(String[] args) {
        int totalNumeros = 50;
        double soma = 0;

        int numero1 = 0;

        do {
            soma += numero1;
            numero1++;
        }while (numero1 <= 50);

        double media = soma / totalNumeros;

        System.out.println("A média aritmetica dos 50 números é: " + media);
    }
}
