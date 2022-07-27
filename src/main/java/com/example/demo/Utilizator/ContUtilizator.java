package com.example.demo.Utilizator;


import java.util.Date;
import java.util.List;

import com.example.demo.Cos.Cos;

public class ContUtilizator {

		private String firstName;
		private String lastName;
		private String CNP;
		private String phoneNumber;
		private String email;
		private String billingAddress;
		private String deliveryAddress;
		private Date registrationDate;
		private Cos cos;
		private List<Comanda> listaComenzi;
		private Wishlist wishlist;
		
		public ContUtilizator() {}
		
		public ContUtilizator(String firstName, String lastName, String CNP, String phoneNumber, String email, String billingAddress, 
				String deliveryAddress, Date registration, Cos basket, List<Comanda> orderList, Wishlist wishlist) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.CNP = CNP;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.billingAddress = billingAddress;
			this.deliveryAddress = deliveryAddress;
			this.registrationDate = registrationDate;
			this.cos = cos;
			this.listaComenzi = listaComenzi;
			this.wishlist = wishlist;
		}
		
		public ContUtilizator(String firstName, String lastName, String CNP, String phoneNumber, String email, String billingAddress, String deliveryAddress, 
				Date registration) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.CNP = CNP;
			this.phoneNumber = phoneNumber;
			this.email = email;
			this.billingAddress = billingAddress;
			this.deliveryAddress = deliveryAddress;
			this.registrationDate = registrationDate;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		public String getCNP() {
			return CNP;
		}
		
		public void setCNP(String CNP) {
			this.CNP = CNP;
		}
		
		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getBillingAddress() {
			return billingAddress;
		}
		
		public void setBillingAddress(String billingAddress) {
			this.billingAddress = billingAddress;
		}
		
		public String getDeliveryAddress() {
			return deliveryAddress;
		}
		
		public void setDeliveryAddress(String deliveryAddress) {
			this.deliveryAddress = deliveryAddress;
		}
		
		public Date getRegistration() {
			return registrationDate;
		}
		
		public void setRegistration(Date registrationDate) {
			this.registrationDate = registrationDate;
		}
		
		public Cos getCos() {
			return cos;
		}
		
		public void setBasket(Cos cos) {
			this.cos = cos;
		}
		
		public List<Comanda> getListaComenzi() {
			return listaComenzi;
		}
		
		public void setListaComenzi(List<Comanda> listaComenzi) {
			this.listaComenzi = listaComenzi;
		}
		
		public Wishlist getWishlist() {
			return wishlist;
		}
		
		public void setWishlist(Wishlist wishlist) {
			this.wishlist = wishlist;
		}

		@Override
		public String toString() {
			String s = "First name: " + firstName + ", Last name: " + lastName + "CNP: " + CNP + ", Phone number: " + phoneNumber
					+ ", Email: " + email + ", Billing address: " + billingAddress + ", Delivery address: " + deliveryAddress
					+ ", Registration date: " + registrationDate + ", Basket: " + cos + ", Order list: " + listaComenzi 
					+ ", Wishlist: " + wishlist;
			return s;
		}
		
		
	}


