package NivelIntermediario.Aula01;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    // Criar um metodo Publico personalizado
    /*
    O metodo VOID não retorna valor nenhum!
     */
    public void sharinganAtivado() {
        System.out.println("Ativando Sharingan...");
    }


    // O metodo STRING vai ter que retornar uma String

    public String euSouUmNinja() {
        return "Eu sou um ninja...";
    }

   // Metodo Int vai ter que retornar um INT

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
