package application;
import entities.*;

public class Program {

	public static void main(String[] args) {
	      // Criando personagens
        Guerreiro guerreiro = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        Mago mago = new Mago("Gandalf", 10, 80, 15, 5, 50, 25);
        Arqueiro arqueiro = new Arqueiro("Legolas", 10, 90, 18, 8, 10, 15);
        
        // Exibindo status iniciais
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
        
        System.out.println("\n==== Início da Batalha! ====\n");
        
        // Batalha
        guerreiro.atacar(mago); // Guerreiro ataca Mago
        mago.lancarMagia(guerreiro); // Mago lança magia no Guerreiro
        arqueiro.atirarFlecha(guerreiro); // Arqueiro atira flecha no Guerreiro

        // Exibindo status finais
        System.out.println("\n==== Fim da Batalha! ====\n");
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
	       
	}

}
