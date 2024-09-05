package entities;
import entities.Personagem;

public class Arqueiro extends Personagem {
	
	private int precisao;
	private int alcance;

	
	public Arqueiro(String nome, int nivel, int hp, int atk, int def, int precisao, int alcance) {
		super(nome, nivel, hp, atk, def);
		this.precisao = precisao;
		this.alcance = alcance;
	}


	/*Método específico*/
	   public void atirarFlecha(Personagem inimigo) {
	        int dano = (this.getAtk() + precisao) - inimigo.getDef();
	        if (dano > 0) {
	            inimigo.setHp(inimigo.getHp() - dano);
	            System.out.println(getNome() + " atirou uma flecha em " + inimigo.getNome() + " e causou " + dano + " de dano.");
	        } else {
	            System.out.println(getNome() + " atirou uma flecha em " + inimigo.getNome() + " mas não causou dano.");
	        }
	    }
	
}
