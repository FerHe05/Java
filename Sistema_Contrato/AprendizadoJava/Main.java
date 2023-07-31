package AprendizadoJava;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY");
		
		System.out.print("Entre com o nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary,
				new Department(departmentName));
		/*
		 * new Worker instancia um novo objeto do tipo worker os dados do objeto são:
		 * workerName baseSalary WorkerLevel.valueOf(workerLevel) é uma instância de
		 * worker level
		 */

		System.out.println("Quantos contratos você deseja cadastrar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Insira o contrato: " + "#"+ i + " data" );
			System.out.print("(DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());	
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duração: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);//o for vai ler todos os contratos e instancia-los para o trabalhador
		}
		
		System.out.println();
		System.out.print("Digite o mês e ano para calcular (MM/YYYY): ");
		String mounthAndYear = sc.next();
		int mounth = Integer.parseInt(mounthAndYear.substring (0, 2));
		int year = Integer.parseInt(mounthAndYear.substring (3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + mounthAndYear + ": " + String.format("%.2f",  worker.income(year, mounth)));
		sc.close();
	}
}
