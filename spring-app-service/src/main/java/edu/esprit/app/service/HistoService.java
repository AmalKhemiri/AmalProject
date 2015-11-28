package edu.esprit.app.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import edu.esprit.app.dao.IHistoDAO;
import edu.esprit.app.entities.Historique_navigation;
@Transactional
public class HistoService implements IHistoService {
 private IHistoDAO histoDAO;
	@Override
	public void addHistorique(Historique_navigation h) {
		// TODO Auto-generated method stub
		histoDAO.addHistorique(h);
	}

	@Override
	public List<Historique_navigation> findAllHistorique() {
		// TODO Auto-generated method stub
		return histoDAO.findAllHistorique();
	}

	@Override
	public Historique_navigation findProductByid(int idHistorique_navigation) {
		// TODO Auto-generated method stub
		return histoDAO.findProductByid(idHistorique_navigation);
	}

	public IHistoDAO getHistoDAO() {
		return histoDAO;
	}

	public void setHistoDAO(IHistoDAO histoDAO) {
		this.histoDAO = histoDAO;
	}

}
