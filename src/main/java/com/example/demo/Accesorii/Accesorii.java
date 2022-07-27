package com.example.demo.Accesorii;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.example.demo.Produs.Produs;

@Entity
@Table(name="Accesorii")
public class Accesorii extends Produs {
	public enum Tip {
		Haina,
		Lesa,
		Zgarda
	}

	private Tip tip;
	
	public Accesorii() {
		super();
	}
	
	public Accesorii(String nume, double pret, int cantitate, Marime marime, Tip tip) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
		this.marime = marime;
		this.tip = tip;
	}
	
	public Tip getTip() {
		return tip;
	}
	
	public void setTip(Tip tip) {
		this.tip = tip;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Tip: " + tip;
	}
	
}

