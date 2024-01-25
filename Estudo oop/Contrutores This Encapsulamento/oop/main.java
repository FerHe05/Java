package oop;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		Construtor
		• É uma operação especial da classe, que executa no momento da
		instanciação do objeto
		*/
		
		//Product product = new Product(); isso é um contrutor sem sobrecarga (padrao)
		
		//Instancia primeiramente a classe dps o objeto
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Quantity: ");
		Integer quantity = sc.nextInt();	
		Product product = new Product(name, quantity);
		
		System.out.println();
		System.out.println(product.message());

	}

}
