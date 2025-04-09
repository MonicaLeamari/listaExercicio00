package org.example.exercicio14;

public class Media {
    public static void main(String[] args) {
        int totalNumeros = 50;
        double soma = 0;

        int numero1 = 0;

        while (numero1 <= 50){
            soma += numero1;
            numero1++;

        }

        double media = soma / totalNumeros;

        System.out.println("A média aritmetica dos 50 números é: " + media);

    }

}
