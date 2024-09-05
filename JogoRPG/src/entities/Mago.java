package entities;

public class Mago extends Personagem{
	private int mana;
	private int poderMagico;
	
	

	public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
		super(nome, nivel, hp, atk, def);//Herda de Personagem 
		this.mana = mana;
		this.poderMagico = poderMagico;
	}
	/*Método específico*/
	   public void lancarMagia(Personagem inimigo) {
	        if (mana > 0) {
	            int danoMagico = this.poderMagico - inimigo.getDef();
	            if (danoMagico > 0) {
	                inimigo.setHp(inimigo.getHp() - danoMagico);
	                System.out.println(getNome() + " lançou magia em " + inimigo.getNome() + " e causou " + danoMagico + " de dano.");
	            } else {
	                System.out.println(getNome() + " lançou magia em " + inimigo.getNome() + " mas não causou dano.");
	            }
	            mana -= 10;
	        } else {
	            System.out.println(getNome() + " está sem mana!");
	        }
	    }
	
	}

