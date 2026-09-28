package NivelIntermediario.Aula01;

public class Main {
    public static void main(String[] args) {
        // Criar um Ninja
        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.idade = 20;
        Naruto.aldeia = "Aldeia da Folha";

        // Criar o ninja Sasuke - Sasuke é um OBJETO
        Ninja Sasuke = new Ninja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 27;

        // Aplicando Metodos aos meus objetos
        Sasuke.sharinganAtivado(); // metodo void
        String chamandoMetodo = Sasuke.euSouUmNinja(); // metodo string/return
        System.out.println(chamandoMetodo);

        int idadeMin = Sasuke.anosParaSeTornarHokage(60);
        System.out.println("Você tem: "+ Sasuke.idade + " anos. Então falta no mínimo: " + idadeMin + " anos para você se tornar Hokage");

        // Criar Sakura
        Ninja Sakura = new Ninja();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 19;
        Sakura.aldeia = "Aldeia da Folha";


    }
}
