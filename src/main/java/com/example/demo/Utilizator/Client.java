package com.example.demo.Utilizator;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.demo.Cos.Cos;
import com.example.demo.Produs.Produs;

@Entity
public class Client extends ContUtilizator {

		@Id
		//@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String username;
		private String password;
		private Boolean enabled;
		private String role;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Boolean getEnabled() {
			return enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Client() {}

		public Client(String username, String password, Boolean enabled, String role) {
			this.username = username;
			this.password = password;
			this.enabled = enabled;
			this.role = role;
		}

		public Client(String firstName, String lastName, String CNP, String phoneNumber, String email,
				String billingAddress, String deliveryAddress, Date registration, Cos cos, List<Comanda> listaComenzi,
				Wishlist wishlist) {
			super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration, cos,
					listaComenzi, wishlist);
		}

		public Client(String firstName, String lastName, String CNP, String phoneNumber, String email,
				String billingAddress, String deliveryAddress, Date registration) {
			super(firstName, lastName, CNP, phoneNumber, email, billingAddress, deliveryAddress, registration);
		}
		

	}


