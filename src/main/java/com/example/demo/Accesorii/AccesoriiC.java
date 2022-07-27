package com.example.demo.Accesorii;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AccesoriiC {
	
	@Autowired
	private AccesoriiService accesoriiService;
	
	@RequestMapping("/accesorii")
	public String getAllFaceMasks(Model model) {
		List<Accesorii> accesorii = accesoriiService.getAllAccesorii();
		model.addAttribute("accesorii", accesorii);
		return "accesorii";
	}
	
	@RequestMapping("/accesorii/{id}")
	public Accesorii getAccesorii(@PathVariable Long id) {
		return accesoriiService.getAccesorii(id);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/masks/{id}")
	public void updateAccesorii(@RequestBody Accesorii accesorii, @PathVariable Long id) {
		accesoriiService.updateAccesorii(id, accesorii);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/masks/{id}")
	public void deleteAccesorii(@PathVariable Long id) {
		accesoriiService.deleteAccesorii(id);
	}

}


