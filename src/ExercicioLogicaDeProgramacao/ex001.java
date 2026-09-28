package ExercicioLogicaDeProgramacao;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int A = scanner.nextInt();
        System.out.println("Digite outro número");
        int B = scanner.nextInt();
        System.out.println("E o último número");
        int C = scanner.nextInt();
        int soma = A + B;
        System.out.println("A = "+ A);
        System.out.println("B = "+ B);
        System.out.println("C = "+ C);
        if (soma < C) {
            System.out.println("A soma de: "+A+ " + " +B+ " é = " + soma + " e é menor que " + C);
        } else if (soma == C) {
            System.out.println("A soma de: "+A+ " + " +B+ " é = " + soma + " e é igual a " + C);
        } else {
            System.out.println("A soma de: "+A+ " + " +B+ " é = " + soma + " e é maior que " + C);
        }
    }
}
