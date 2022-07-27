package com.example.demo.Cos;

import java.util.ArrayList;


import com.example.demo.Produs.Produs;
import com.example.demo.Produs.Produs.Marime;
import com.example.demo.Accesorii.Accesorii;
import com.example.demo.Accesorii.Accesorii.Tip;
import com.example.demo.Hrana.Hrana;
import com.example.demo.Hrana.Hrana.Animal;

public class CosService {


	private ArrayList<Produs> produse = new ArrayList<>();
	
	public CosService() {
		populate();
	}
	
	public ArrayList<Produs> getProdus(){
		return produse;
	}
	
	public void setProdus(ArrayList<Produs> produs) {
		produse.addAll(produs);	
	}
	
	private void populate() {

		Produs p1 = new Accesorii("Zgarda caini", 55, 100, Marime.Mediu, Tip.Zgarda);
		Produs p2 = new Accesorii("Lesa pisici", 100, 20, Marime.Mic, Tip.Lesa);
		Produs p3 = new Hrana("Vitamine Hamsteri", 45, 80, Marime.Mic, Animal.Rozatoare);

		produse.add(p1);
		produse.add(p2);
		produse.add(p3);
	}
}

