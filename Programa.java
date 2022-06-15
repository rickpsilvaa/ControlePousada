package model;

import java.util.Scanner;

import Entites.Aluguel;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//double[] aluguel = new double[10]
		Aluguel[] vetor = new Aluguel[10];
		
		System.out.println("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Aluguel #"+i+":");
			System.out.print("Nome: ");
			sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Aluguel(nome, email);
		}
		
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i<10; i++) {
			if (vetor[i] != null) {
				System.out.println(i+": "+vetor[i]);
			}
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
		public String toString(){
			return nome +", "
		}
	
	
	}

}
