package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.example.demo.model.Receta;
import com.example.demo.servicio.RecipsService;

	@Controller
//	@RequestMapping("/resetas")
	public class RecipController {
	
	private final RecipsService recipsService;
	
	public RecipController(RecipsService recipsService) {
        this.recipsService = recipsService;
    }

	
	@GetMapping("/ver")
    public String viewBooks(Model model) {
        model.addAttribute("listarecetas", recipsService.getRecetas());
        return "recetas";
    }
	
	@GetMapping("/addReceta")
	    public String addBookView(Model model) {
	        model.addAttribute("receta", new Receta());
	        return "addreceta";
	    }

	 @PostMapping("/addReceta")
	    public RedirectView addBook(@ModelAttribute("receta") Receta receta, RedirectAttributes redirectAttributes) {
	        final RedirectView redirectView = new RedirectView("/addReceta", true);
	        Receta savedReceta = recipsService.addReceta(receta);
	        redirectAttributes.addFlashAttribute("savedReceta", savedReceta);
	        redirectAttributes.addFlashAttribute("addRecetaSuccess", true);
	        return redirectView;
	        
	    } 

}
