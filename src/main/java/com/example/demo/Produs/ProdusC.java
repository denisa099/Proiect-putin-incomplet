package com.example.demo.Produs;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProdusC {


	@Autowired
	private ProdusService produsService;
	
	@RequestMapping("/produse")
	public String getAllProduse(Model model) {
		List<Produs> produse = produsService.getAllProduse();
		model.addAttribute("produse", produse);
		return "produse";
	}
	
	@RequestMapping("/tshirts/{id}")
	public Produs getProdus(@PathVariable Long id) {
		return produsService.getProdus(id);
	}
	
	@RequestMapping("/addTshirt")
	public String addProdus(Produs produs) {
		produsService.addProdus(produs);
		return"addProdus";
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/tshirts/{id}")
	public void updateProdus(@RequestBody Produs produs, @PathVariable Long id) {
		produsService.updateProdus(id, produs);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/tshirts/{id}")
	public void deleteProdus(@PathVariable Long id) {
		produsService.deleteProdus(id);
	}
	
}

