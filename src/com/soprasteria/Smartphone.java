package com.soprasteria;

public class Smartphone extends Prodotto {
    private String imei;
    private int memoria;
    
    public Smartphone (int codice, String nome, String marca, Double prezzo, Double iva) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

	public String getImei() {
		return imei;
	}


	public int getMemoria() {
		return memoria;
	}

    



}
