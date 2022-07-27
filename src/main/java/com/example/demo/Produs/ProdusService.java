package com.example.demo.Produs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdusService {
	
	@Autowired
	private ProdusR produsR;

	public List<Produs> getAllProdus() {
		List<Produs> produse = new ArrayList<>();
		produsR.findAll().forEach(produse::add);
		return produse;
	}

	public Produs getProdus(Long id) {
		return produsR.findById(id).get();
	}

	public void addProdus(Produs produs) {
		produsR.save(produs);
	}

	public void updateProdus(Long id, Produs produs) {
		produsR.save(produs);
	}

	public void deleteProdus(Long id) {
		produsR.deleteById(id);
	}

	public List<Produs> getAllProduse() {
		// TODO Auto-generated method stub
		return null;
	}
}

