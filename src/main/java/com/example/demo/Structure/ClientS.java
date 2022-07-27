package com.example.demo.Structure;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.example.demo.Utilizator.ContUtilizator;
import com.example.demo.Utilizator.Client;

public class ClientS {
	private ArrayList<ContUtilizator> conturi = new ArrayList<>();
	
	public ClientS() {
		try {
			populate();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<ContUtilizator> getContUtilizator() {
		return conturi;
	}
	
	public void setContUtilizator(ArrayList<ContUtilizator> cont) {
		conturi.addAll(cont);
	}
	
	private void populate() throws ParseException {
		String s1 = "17/05/2021";  
	    Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(s1);  
	    
	    String s2 = "17/05/2021";  
	    Date d2 = new SimpleDateFormat("dd/MM/yyyy").parse(s2);  
	    
	    String s3 = "11/03/2021";  
	    Date d3 = new SimpleDateFormat("dd/MM/yyyy").parse(s3);  
	    
	    ContUtilizator a1 = new Client("Mihaila", "Cristina", "2900712890032", "0732453021", "mihaila.cristina@gmail.com", "Bd. Dezrobirii, nr. 9", 
				"Bd. Dezrobirii, nr. 9", d1);
	    ContUtilizator a2 = new Client("Stefanescu", "Daniel", "1800312450076", "0760903125", "dstefanescu@gmail.com", "Crinul de Padure, nr. 3", 
				"Crinul de Padure, nr 3", d2);
	    ContUtilizator a3 = new Client("Mai", "Bogdan", "1951129124509", "0766809333", "mai.bogdan@gmail.com", "Bd. Revolutiei, nr. 101",
				"Strada Gorjului, nr. 12", d3);
		
	    conturi.add(a1);
	    conturi.add(a2);
	    conturi.add(a3);
	}
}

