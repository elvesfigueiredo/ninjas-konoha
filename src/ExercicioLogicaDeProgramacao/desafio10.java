package ExercicioLogicaDeProgramacao;

import java.util.Scanner;

public class desafio10 {
    /*
    Você precisa criar um programa que recebe uma senha e permite no máximo 3 tentativas. Se a senha estiver correta,
    mostra "Acesso permitido". Caso contrário, depois de 3 erros, mostra "Acesso bloqueado".
     */
    public static void main(String[] args) {
        Scanner escrever = new Scanner(System.in);
        int count = 0;
        int tentativa;
        int numeroMaxDeTentativas = 3;
        int senha = 12345;

        while(count < numeroMaxDeTentativas){
            System.out.println("Qual a senha?");
            tentativa = escrever.nextInt();
            if(tentativa==senha){
                System.out.println("Senha correta!");
                System.out.println("Acesso Permitido!");
                break;
            } else {
                System.out.println("Senha incorreta!"); count++;
                if (count == numeroMaxDeTentativas) {
                    System.out.println("Acesso bloqueado!");
                }
            }
        }

    }
}