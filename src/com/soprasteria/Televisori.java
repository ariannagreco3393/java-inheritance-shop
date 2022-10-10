package com.soprasteria;

public class Televisori extends Prodotto {
	
	private int pollici;
	private boolean isSmart;
	
	
	public Televisori(int codice, String nome, String marca, double prezzo, double iva, int pollici, boolean isSmart ) {
		super(codice, nome, marca, prezzo, iva);
		this.pollici = pollici;
		this.isSmart = isSmart;
	}


	public int getPollici() {
		return pollici;
	}



	public boolean isSmart() {
		return isSmart;
	}


	
}
