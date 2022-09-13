package application;
/*Herança
• É um tipo de associação que permite que uma classe herde todos dados e 
comportamentos de outra
• Definições importantes
• Vantagens
• Reuso
• Polimorfismo
• Sintaxe
• class A extends B*/
import entities.BusinessAccount;

public class Program {

	public static void main(String[] args) {

		BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

		System.out.println(account.getBalance());
	}
}
