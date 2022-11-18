package generation.italy.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Inserisci nome prodotto: ");
		String nome = sc.nextLine();
		
		System.out.println("Inserisci descrizione prodotto: ");
		String descrizione = sc.nextLine();
		
		System.out.println("Inserisci prezzo prodotto: ");
		int prezzo = sc.nextInt();
		
		Prodotto prodotto1 = new Prodotto(nome, descrizione,prezzo);
		System.out.println(prodotto1);
		
		
	}

}
