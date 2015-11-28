package edu.esprit.app.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Personne
 *
 */
@Entity

public class Personne implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Personne() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String idPersonne;
	private String login;
	private String password;
	@OneToMany(mappedBy="personne")
	private List<Historique_navigation> historique_navigations;

	public Personne(String idPersonne, String login, String password) {
		super();
		this.idPersonne = idPersonne;
		this.login = login;
		this.password = password;
	}

	public String getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(String idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Historique_navigation> getHistorique_navigations() {
		return historique_navigations;
	}

	public void setHistorique_navigations(List<Historique_navigation> historique_navigations) {
		this.historique_navigations = historique_navigations;
	}
	
	
	
	
	
	
   
}
