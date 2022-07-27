package com.example.demo.Utilizator;
import java.util.List;

import com.example.demo.Produs.Produs;


public class Comanda {
		private enum Status {
			PROCESSING,
			ON_HOLD,
			FAILED,
			CANCELED,
			COMPLETED,
			PENDING_PAYMENT,
			REFUNDED
		}
		private int numarComanda;
		private Client client;
		private List<Produs> purchase;
		private Status status;
		//invoice

		public Comanda() {}
		
		public Comanda(int numarComanda, Client customer, List<Produs> purchase, Status status) {
			this.numarComanda = numarComanda;
			this.client = client;
			this.purchase = purchase;
			this.status = status;
		}
		
		public int getNumarComanda() {
			return numarComanda;
		}
		
		public void setNumarComanda(int numarComanda) {
			this.numarComanda = numarComanda;
		}
		
		public Client getClient() {
			return client;
		}
		
		public void setClient(Client client) {
			this.client = client;
		}
		
		public List<Produs> getPurchase(){
			return purchase;
		}
		
		public void setPurchase(List<Produs> purchase) {
			this.purchase = purchase;
		}
		
		public Status getStatus() {
			return status;
		}
		
		public void setStatus(Status status) {
			this.status = status;
		}
		
		@Override
		public String toString() {
			String s = "Numar Comanda: " + numarComanda + ", Client: " + client + ", Purchased products: " + purchase + ", Status: " + status;
			return s;
		}
		
	}


