package entities;

public class Product {
	public String name;
	public Integer quantity;
	
	
		/*
		Encapsulamento
		É um princípio que consiste em
		esconder detalhes de implementação
		de uma classe, expondo apenas
		operações seguras e que mantenham
		os objetos em um estado consistente.
		Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
	 	*/
		public String getName() {
		return name;
		}
		public void setName(String name) {
		this.name = name;
		}
		public double getQuantity() {
		return quantity;
		}
		public void setQuantity(int quantity) {
		this.quantity = quantity;
		}
		
		
		/*
		 * Para evitar lixo de memória utilizamos uma classe com parâmetros, 
		 * a fim de evitar que a memória crie valores vázios na sua primeira execução
		 * */
		public Product(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
		/*
		 * a palavra this é uma referência para o próprio objeto
		 * Usos comuns:
		 • Diferenciar atributos de variáveis locais
		 • Passar o próprio objeto como argumento na chamada de um método ou construtor
		 * Se resume em this.name esse é o atributo da classe que vai receber o valor atravez do parâmetro
		 * */
	}

	public String message() {
		return "Name of product: " + getName()
				+ ", "
				+"Available quantity: " + getQuantity();
				
	}
}
