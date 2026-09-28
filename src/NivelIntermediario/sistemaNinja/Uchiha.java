package NivelIntermediario.sistemaNinja;

public class Uchiha extends Ninja {
    String habilidadeNinja;

    public void mostrarHabilidadeNinja(){
        System.out.println("Habilidade de Ninja: " + habilidadeNinja);
    }
    public void mostrarInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Missao: "+missao);
        System.out.println("Nivel de dificuldade: "+nivelDeDificuldade);
        System.out.println("Status: "+statusMissao);
        System.out.println("Habilidade de Ninja: " + habilidadeNinja);
    }
}