package entities;


/*Anotações
 * Uso do this em instancias de atributos das classes:
 * Sem o this, o compilador não saberia se você está se referindo à variável de instância nome (o atributo da classe) 
 * ou ao parâmetro nome do método (que está no escopo do construtor). O this.nome se refere ao atributo da instância atual da classe, 
 * enquanto nome (sem o this) é o parâmetro que foi passado para o construtor.
 * */
public class Personagem {
	
	private String nome;
	private int nivel;


	private int hp;
	private int atk;
	private int def;
	
	public Personagem(String nome, int nivel, int hp, int atk, int def) {
		this.nome = nome;
		this.nivel = nivel;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
	}
	
	public void atacar(Personagem inimigo) {
		int dano = this.atk - inimigo.def;
		if(dano > 0) {
			inimigo.hp -= dano;
			System.out.println(this.nome + "atacou" + inimigo.nome + "e causou" + dano + "de dano");
		}else {
            System.out.println(this.nome + " atacou " + inimigo.nome + " mas não causou dano.");
        }
	}
	
    public void exibirStatus() {
        System.out.println("Nome: " + this.nome + " | Nível: " + this.nivel + " | HP: " + this.hp + " | ATK: " + this.atk + " | DEF: " + this.def);
    }
	
	public boolean estaVivo() {
		return this.hp > 0;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
}
