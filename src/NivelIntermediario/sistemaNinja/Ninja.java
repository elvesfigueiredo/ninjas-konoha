package NivelIntermediario.sistemaNinja;

public class Ninja {
    String nome;
    int idade;
    String missao;
    String nivelDeDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missao: "+missao);
        System.out.println("Nivel de dificuldade: "+nivelDeDificuldade);
        System.out.println("Status: "+statusMissao);
    }
}
