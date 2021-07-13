package br.com.generation.atividade07;

public class TestaAnimal {

    public static void main(String[] args) {
        
        Cachorro meudog = new Cachorro();
        Cavalo cavalo = new Cavalo();
        Preguica preguica = new Preguica();
        
        System.out.println("__________RG do Cachorro__________");
        meudog.nome();
        meudog.idade();
        meudog.emitirSom();
        meudog.corre();
        System.out.println("__________________________________");
        
        System.out.println("\n__________RG do Cavalo__________");
        cavalo.nome();
        cavalo.idade();
        cavalo.emitirSom();
        cavalo.corre();
        System.out.println("________________________________");
        
        System.out.println("\n__________RG da Preguiça__________");
        preguica.nome();
        preguica.idade();
        preguica.emitirSom();
        preguica.subirArvore();
        System.out.println("__________________________________");

    }

}