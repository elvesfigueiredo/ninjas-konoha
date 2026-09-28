package NivelIntermediario.sistemaNinja;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Ninja> ninjas = new ArrayList<>();
        int opcao;
        do {
            System.out.println(" ==== Welcome to Konoha ==== ");
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Exibir informações de um Ninja");
            System.out.println("2 - Cadastro Ninja");
            System.out.println("3 - Atualizar habilidade Ninja");
            System.out.println("4 - Remover Ninja");
            System.out.println("0 - Sair");
            opcao = input.nextInt();
            input.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum Ninja foi encontrado.");
                    } else {
                        boolean voltar = false;

                        while (!voltar) {
                            System.out.println("Ninjas Cadastrados:");
                            for (int i = 0; i < ninjas.size(); i++) {
                                System.out.println((i + 1) + ". " + ninjas.get(i).nome);
                            }
                            System.out.println("0. Voltar ao menu");
                            System.out.println("Escolha o número do Ninja");
                            int escolha = input.nextInt();
                            input.nextLine();

                            if (escolha == 0) {
                                voltar = true;
                            }
                            else if (escolha >= 1 && escolha <= ninjas.size()) {
                                ninjas.get(escolha - 1).mostrarInformacoes();
                                voltar = true;
                            } else {
                                System.out.println("Opção Inválida. Tente novamente, ou digite 0 para voltar ao menu");
                            }
                        }
                    }
                    break;

                case 2:
                    Uchiha novo = new Uchiha();
                    novo = new Uchiha();
                    System.out.println("Qual nome do ninja");
                    novo.nome = input.nextLine();
                    System.out.println("Qual idade do ninja");
                    novo.idade = input.nextInt();
                    input.nextLine();
                    System.out.println("Qual a atual missão do Ninja?");
                    novo.missao = input.nextLine();
                    System.out.println("Qual a dificuldade da missão?");
                    novo.nivelDeDificuldade = input.nextLine();
                    System.out.println("Qual status da missão Ninja?");
                    novo.statusMissao = input.nextLine();
                    System.out.println("Qual a habilidade Ninja?");
                    novo.habilidadeNinja = input.nextLine();

                    ninjas.add(novo);
                    System.out.println("Ninja Cadastrado! Total de Ninjas Cadastrados: " + ninjas.size());
                    break;

                case 3:
                    if (ninjas.isEmpty()){
                        System.out.println("Nenhum Ninja foi encontrado.");
                    } else {
                        boolean voltar = false;

                        while (!voltar) {
                            System.out.println("Atualização de habilidade do ninja");
                            for (int i = 0; i < ninjas.size(); i++) {
                                System.out.println((i + 1) + ". " + ninjas.get(i).nome);
                            }
                            System.out.println("0. Voltar ao menu");
                            System.out.println("Qual ninja você deseja atualizar a habilidade Ninja?");
                            int escolha = input.nextInt();
                            input.nextLine();

                            if (escolha == 0) {
                                voltar = true;
                            } else if(escolha >= 1 && escolha <= ninjas.size()) {
                                Ninja ninja = ninjas.get(escolha - 1);

                                if (ninja instanceof Uchiha){
                                    Uchiha uchiha =  (Uchiha) ninja;
                                    ninja.mostrarInformacoes();
                                    System.out.println("Qual o nome da nova habilidade ninja?");
                                    String nova =  input.nextLine();
                                    uchiha.habilidadeNinja = nova;
                                    System.out.println("Habilidade de " + ninja.nome + " atualizada para: "+ nova);
                                }
                                voltar = true;
                            } else {
                                System.out.println("Opção Invalida. Tente novamente ou digite 0 para voltar ao menu");
                            }
                        }
                    }
                    break;
                case 4:
                    if (ninjas.isEmpty()) {
                        System.out.println("Nenhum Ninja foi encontrado.");
                    } else {
                        boolean voltar = false;

                        while (!voltar) {
                            System.out.println("Qual Ninja você deseja remover?");
                            for (int i = 0; i < ninjas.size(); i++) {
                                System.out.println((i + 1) + ". " + ninjas.get(i).nome);
                            }
                            System.out.println("0. Voltar ao menu");
                            System.out.println("Digite o numero do ninja que deseja remover");
                            int remover = input.nextInt();
                            input.nextLine();
                            if (remover == 0) {
                                voltar = true;
                            }
                            else if (remover >= 1 && remover <= ninjas.size()) {
                                ninjas.remove(remover - 1);
                                voltar = true;
                            } else {
                                System.out.println("Opção invalida. Tente novamente.");
                            }
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        } while (opcao != 0);
    }
}





