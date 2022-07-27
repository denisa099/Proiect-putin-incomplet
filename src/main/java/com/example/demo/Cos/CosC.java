package com.example.demo.Cos;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Produs.Produs;

@Controller

public class CosC {

	private CosService cosService;
	
	private CosService cos = new CosService();

	@GetMapping("/cos")
	public String getToateProdusele(Model model) {
		ArrayList<Produs> produse = cos.getProdus();
		model.addAttribute("cos", produse);
		return "cos";			
	}
}

