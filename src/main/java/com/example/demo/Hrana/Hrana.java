package com.example.demo.Hrana;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.example.demo.Produs.Produs;


@Entity
@Table(name="Hrana")


public class Hrana extends Produs {
	
	public enum Animal {
		Caini,
		Pisici,
		Rozatoare,
		Reptile,
		Pasari,
		Pesti
	}
	

	private Animal animal;
	
	public Hrana() {
		super();
	}
	
	public Hrana(String nume, double pret, int cantitate, Marime marime, Animal animal) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.cantitate = cantitate;
		this.marime = marime;
		this.animal = animal;
	}

	
	public Animal getAnimal() {
		return animal;
	}
	
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Animal: " + animal;
	}
}
