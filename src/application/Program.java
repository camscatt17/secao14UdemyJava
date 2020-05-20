package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Pessoa> lista = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int num = sc.nextInt();
		
		for (int i = 1; i<= num; i++) {
			System.out.print("Individual or company (i/c)? ");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Atual income: ");
			Double income = sc.nextDouble();
			if (resp == 'i') {
				System.out.print("Health expenditures: ");
				double saude = sc.nextDouble();
				lista.add(new PessoaFisica(name, income, saude));				
			}
			else {
				System.out.print("Number of employees: ");
				int numf= sc.nextInt();
				lista.add(new PessoaJuridica(name, income, numf));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		for (Pessoa pessoa : lista) {
			System.out.println(pessoa.getNome()+": $" + String.format("%.2f",pessoa.impostoPago()));
		}
		
		sc.close();
	}

}
