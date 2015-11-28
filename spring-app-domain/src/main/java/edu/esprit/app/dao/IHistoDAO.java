package edu.esprit.app.dao;

import java.util.List;

import edu.esprit.app.entities.Historique_navigation;

public interface IHistoDAO {

	public abstract void addHistorique(Historique_navigation h);
	public abstract List<Historique_navigation> findAllHistorique();
	public abstract Historique_navigation findProductByid(int idHistorique_navigation);

	
}
