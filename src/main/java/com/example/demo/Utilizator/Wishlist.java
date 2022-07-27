package com.example.demo.Utilizator;

import java.util.List;

import com.example.demo.Produs.Produs;


public class Wishlist {

		private List<Produs> produse;
		private double totalCost;
		
		public Wishlist() {}
		
		public Wishlist(List<Produs> produse, double totalCost) {
			this.produse = produse;
			this.totalCost = totalCost;
		}
		
		public List<Produs> getProdus() {
			return produse;
		}
		
		public void setProduct(List<Produs> produse) {
			this.produse = produse;
		}
		
		public double getTotalCost() {
			return totalCost;
		}
		
		public void setTotalCost(double totalCost) {
			this.totalCost = totalCost;
		}
		
		@Override
		public String toString() {
			String s = "Produs: " + produse + ", Total cost: " + totalCost;
			return s;
		}
		
	}


