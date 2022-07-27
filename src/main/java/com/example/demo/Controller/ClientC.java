package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Structure.ClientS;
import com.example.demo.Utilizator.ContUtilizator;
import com.example.demo.Utilizator.Client;

@Controller
public class ClientC {

		private ClientS clientStructure = new ClientS();

		@GetMapping("/customers")
		public String getAllClienti(Model model) {
			ArrayList<ContUtilizator> conturi = clientStructure.getContUtilizator();
			model.addAttribute("clienti", conturi);
			return "clienti";
		}

		@RequestMapping(value = "/customers/{firstName}", method = RequestMethod.GET)
		public String getClientByFirstName(@PathVariable(name = "firstName") String firstName, Model model) {
			
			ArrayList<ContUtilizator> conturi = clientStructure.getContUtilizator();
		
			for(ContUtilizator a : conturi) {
				if(a.getFirstName().equals(firstName)) {
					model.addAttribute("customersByFirstName", a);
					return "customersByFirstName";
				}
			}
			return null;
		}
	}
