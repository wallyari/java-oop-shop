package generation.italy.shop;

import java.util.Random;

public class Prodotto {
	int codice;
	String nome;
	String descrizione;
	int prezzo;
	int iva;
	
	
	public Prodotto (String nome, String descrizione, int prezzo) {
		
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		iva = 20;
			
	}
	
	public int getPrice(){
		return prezzo;			
		
	}
	
	public float getIvaPrice() {
		return (float) prezzo + ((float) (prezzo * iva / 100f));
	}
	
	public int getCode() {
		Random rnd = new Random();
		return codice = rnd.nextInt(99999);
	}
	
	
	 @Override
	public String toString() {
		
		return "Prodotto: " + "Codice: " + getCode() 
				+ "\nNome: " + nome
				+"\nDescrizione: " + descrizione
				+"\nPrezzo: " + getPrice() + " euro"
				+"\nPrezzo con Iva: " + getIvaPrice() + " euro";
	}
	
	

	
	
			

}
