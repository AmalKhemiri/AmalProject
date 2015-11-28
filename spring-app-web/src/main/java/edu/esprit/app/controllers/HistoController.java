package edu.esprit.app.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.esprit.app.entities.Historique_navigation;
import edu.esprit.app.service.IHistoService;

@Controller
public class HistoController {
@Autowired
 private IHistoService histoService;

public IHistoService getHistoService() {
	return histoService;
}

public void setHistoService(IHistoService histoService) {
	this.histoService = histoService;
}
 
 
@RequestMapping(value = "/index")
public String loadHomePage(Model model){
	
	model.addAttribute("historique", new Historique_navigation());
	model.addAttribute("historiques", histoService.findAllHistorique());
	return "home";

}


@RequestMapping(value = "/save")
public String addHistorique(@Valid Historique_navigation historique, BindingResult br,  Model model){
	
	if(br.hasErrors()) {
	
		model.addAttribute("historiques", histoService.findAllHistorique());
		return "home";
	}
	return "home";
	
}


@RequestMapping(value = "/select")
public String selectForUpdate(@RequestParam("selectedHist") int idHistorique_navigation, Model model){

	model.addAttribute("historique", histoService.findProductByid(idHistorique_navigation));
	model.addAttribute("historiques", histoService.findAllHistorique());
	return "home";
}

 
 
}
