package com.example.demo.Hrana;


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
public class HranaC {
	
		@Autowired
		private HranaService hranaService;
		
		@RequestMapping("/hrana")
		public String getAllHrana(Model model) {
			List<Hrana> hrana = hranaService.getAllHrana();
			model.addAttribute("hrana", hrana);
			return "hrana";
		}
		
		@RequestMapping("/hrana/{id}")
		public Hrana getHrana(@PathVariable Long id) {
			return hranaService.getHrana(id);
		}
		
		@RequestMapping("/addHrana")
		public String addHrana(Hrana hrana) {
			hranaService.getHrana(hrana);
			return "addHrana";
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/hrana/{id}")
		public void updateHrana(@RequestBody Hrana hrana, @PathVariable Long id) {
			hranaService.updateHrana(id, hrana);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/hrana/{id}")
		public void deleteHrana(@PathVariable Long id) {
			hranaService.deleteHrana(id);
		}
		
	}

