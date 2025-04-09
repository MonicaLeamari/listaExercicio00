package org.example.exercicio10;

public class Divisao {
    public static void main(String[] args) {
        int numero1 = 6;
        int numero2 = 4;
        int numero3 = numero1 / numero2;

        System.out.println("A divisão do número " + numero1 + " pelo número " + numero2 + " é igual a " + numero3);
        // o resultado da divisão é 1,5 , porém, como foi pedido no exercício ser int, então o 0,5 será descartada, só iria aparecer o 1,5 se na criação da variável fosse Double

    }
}
