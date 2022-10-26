package controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.method.annotation.ModelAttributeMethodProcessor;
import org.springframework.web.servlet.ModelAndView;

import com.springsql.Produit;
import com.springsql.SpringBootMysqlApplication;
import service.ProduitService;

@Controller
public class ProduitController {
	
	@Autowired
	ProduitService produitService;
	@GetMapping("/")
	public String viewHomePage(Model model) {
		List<Produit> listp = produitService.findAllProduits();
		if(CollectionUtils.isEmpty(listp)) {
			listp = Arrays.asList(new Produit());
		}
		model.addAttribute("listp", listp);
		return "home";
	}
	@GetMapping("/newProduit")
	public ModelAndView addProduit() {
		Produit p = new Produit();
		ModelAndView model = new ModelAndView("newProduit");
		model.addObject("produit", p);
		return model;
	}
	
	@PostMapping("/saveProduit")
	public String saveProduit(@ModelAttribute Produit p) {
		produitService.saveProduit(p);
		return "redirect:/";
		
	}

	
    }


