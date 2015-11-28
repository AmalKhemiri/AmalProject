package edu.esprit.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Navigateur implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNavigateur;
	private String name;
	private Float version;
	@OneToMany(mappedBy="navigateur")
	private List<Historique_navigation> historique_navigations;
	
	
	
	public int getIdNavigateur() {
		return idNavigateur;
	}
	public void setIdNavigateur(int idNavigateur) {
		this.idNavigateur = idNavigateur;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Float getVersion() {
		return version;
	}
	public void setVersion(Float version) {
		this.version = version;
	}
	public Navigateur(int idNavigateur, String name, Float version) {
		super();
		this.idNavigateur = idNavigateur;
		this.name = name;
		this.version = version;
	}
	
	public Navigateur() {
		super();
	}
	public List<Historique_navigation> getHistorique_navigations() {
		return historique_navigations;
	}
	public void setHistorique_navigations(List<Historique_navigation> historique_navigations) {
		this.historique_navigations = historique_navigations;
	}

	
}
