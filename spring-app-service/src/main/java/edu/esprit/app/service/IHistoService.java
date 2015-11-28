package edu.esprit.app.service;

import java.util.List;

import edu.esprit.app.entities.Historique_navigation;

public interface IHistoService {
	
	public abstract void addHistorique(Historique_navigation h);
	public abstract List<Historique_navigation> findAllHistorique();
	public abstract Historique_navigation findProductByid(int idHistorique_navigation);
	
	
}
