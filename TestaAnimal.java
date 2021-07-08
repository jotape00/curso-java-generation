package br.com.generation.aula06.atividade06;
//import javax.swing.JOptionPane;

public class TestaAnimal {
	public static void main(String[] args) {
		Cachorro meudog = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		meudog.setNome("Astolfo");
		meudog.setIdade(18);
		
		cavalo.setNome("Pé-de-pano");
		cavalo.setIdade(6);
		
		preguica.setNome("Maikezin");
		preguica.setIdade(30);
		
		meudog.setEmiteSom("AU AU AU AU!");
		cavalo.setEmiteSom("Ihihihii in in!");
		preguica.setEmiteSom("AAAaaaa AaaaA!");
		
		System.out.println("------> Som dos animais <------");
		System.out.println("Cachorro: " + meudog.getEmiteSom());
		System.out.println("Cavalo: " + cavalo.getEmiteSom());
		System.out.println("Preguiça: " + preguica.getEmiteSom());
		System.out.println("\n========== RG do Cachorro ==========");
		System.out.println("Nome: " + meudog.getNome());
		System.out.println("Idade: " + meudog.getIdade() + " anos");
		System.out.print("Corre? ");
		meudog.naocorre();
		System.out.println("\n========== RG do Cavalo ==========");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade() + " anos");
		System.out.print("Corre? ");
		cavalo.corre();
		System.out.println("\n========== RG do Bicho-Preguiça ==========");
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade() + " anos");
		System.out.print("Sobe árvore? ");
		preguica.subirArvore();
		
		//JOptionPane.showMessageDialog(null, meudog.getNome());
	}
}
