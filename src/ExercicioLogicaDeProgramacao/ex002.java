package ExercicioLogicaDeProgramacao;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        // Faça um algoritmo para receber
        // um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int parOuImpar = scanner.nextInt();

        if (parOuImpar % 2 == 0) {
            System.out.println(parOuImpar + " é par");
        } else {
            System.out.println(parOuImpar + " é impar");
        }
        if (parOuImpar > 0 ){
            System.out.println("Positivo");
        } else if (parOuImpar < 0) {
            System.out.println("Negativo");
        } else
        {
            System.out.println("zero");
        }

    }
}
