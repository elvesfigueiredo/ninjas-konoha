package NivelIntermediario.Desafio01Corrigido;

public class Uchiha extends Ninja {
    String habilidadeEspecial; // isso é um atributo

    public void mostrarhabilidadeEspecial(){ // metodo
        System.out.println("Habilidade: " + habilidadeEspecial);
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDeDificuldade);
        System.out.println("Status: " + statusDaMissao);
        System.out.println("Habilidade especial Uchiha: " + habilidadeEspecial);
    }
}
