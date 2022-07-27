package com.example.demo.Produs;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import com.example.demo.Accesorii.Accesorii.Tip;

@Entity
@Table(name="Produse")
//@Inheritance(strategy = InheritanceType.JOINED)
public class Produs {
		
		public enum Marime {
			Mic,
			Mediu,
			Mare,
		}

		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		protected Long id;
		protected String nume;
		protected double pret;
		protected int cantitate;
		protected Marime marime;
		
		public Produs() {}
		
		public Produs(String nume, double pret, int cantitate, Marime marime) {
			this.nume = nume;
			this.pret = pret;
			this.cantitate = cantitate;
			this.marime = marime;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}
		
		public double getPret() {
			return pret;
		}
		
		public void setPret(double pret) {
			this.pret = pret;
		}
		
		public int getCantitate() {
			return cantitate;
		}
		
		public void setCantitate(int cantitate) {
			this.cantitate = cantitate;
		}
		
		public Marime getMarime() {
			return marime;
		}
		
		public void getMarime(Marime marime) {
			this.marime = marime;
		}

		@Override
		public String toString() {
			String s = "Id: " + id + "Nume: " + nume + ", Pret: " + pret + ", Cantitate: " + cantitate + ", Marime: " + marime;
			return s;
		}
	}

