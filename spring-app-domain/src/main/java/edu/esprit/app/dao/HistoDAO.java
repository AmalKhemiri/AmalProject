package edu.esprit.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import edu.esprit.app.entities.Historique_navigation;

public class HistoDAO implements IHistoDAO{
	@PersistenceContext
	EntityManager em;
	@Override
	public void addHistorique(Historique_navigation h) {
		em.persist(h);
		
	}

	@Override
	public List<Historique_navigation> findAllHistorique() {

		return em.createQuery("select h from Historique_navigation P", Historique_navigation.class)
				.getResultList();
	}

	@Override
	public Historique_navigation findProductByid(int idHistorique_navigation) {
		// TODO Auto-generated method stub
		return em.find(Historique_navigation.class, idHistorique_navigation);
	}
	
	

}
