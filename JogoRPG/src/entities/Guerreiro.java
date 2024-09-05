package entities;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	private int forcaExtra;
	private int armadura;

	public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
		super(nome, nivel, hp, atk, def);
		this.forcaExtra = forcaExtra;
		this.armadura = armadura;
	}
	
	/*Método específico*/
	/*
	 * Uso do Override
	 * O @Override é uma anotação em Java que indica que um método está sendo sobrescrito de uma superclasse ou de uma interface. 
	 * Se você tiver uma classe Personagem com um método atacar() e uma classe Guerreiro que quer modificar esse comportamento, você utiliza @Override para sobrescrever:
	 * 
	 * */

	@Override
	public void atacar(Personagem inimigo) {
        	int dano = (this.getAtk() + this.forcaExtra) - inimigo.getDef();
        	   if (dano > 0) {
                   inimigo.setHp(inimigo.getHp() - dano);
                   System.out.println(getNome() + " atacou " + inimigo.getNome() + " com força extra e causou " + dano + " de dano.");
               } else {
                   System.out.println(getNome() + " atacou " + inimigo.getNome() + " mas não causou dano.");
               }
     }
	
	
	
	
	}

