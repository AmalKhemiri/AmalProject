package edu.esprit.app.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Historique_navigation
 *
 */
@Entity

public class Historique_navigation implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Historique_navigation() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idHistorique_navigation;
	private String url;
	private Date date_entree;
	@ManyToOne
	@JoinColumn(name="idPers",referencedColumnName="idPersonne",insertable=false,updatable=false)
	private Personne personne;
	
	
	@ManyToOne
	@JoinColumn(name="idHis",referencedColumnName="idNavigateur",insertable=false,updatable=false)
	private Navigateur navigateur;

	public int getIdHistorique_navigation() {
		return idHistorique_navigation;
	}
	public void setIdHistorique_navigation(int idHistorique_navigation) {
		this.idHistorique_navigation = idHistorique_navigation;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Date getDate_entree() {
		return date_entree;
	}
	public void setDate_entree(Date date_entree) {
		this.date_entree = date_entree;
	}
	public Historique_navigation(int idHistorique_navigation, String url, Date date_entree) {
		super();
		this.idHistorique_navigation = idHistorique_navigation;
		this.url = url;
		this.date_entree = date_entree;
	}
	public Navigateur getNavigateur() {
		return navigateur;
	}
	public void setNavigateur(Navigateur navigateur) {
		this.navigateur = navigateur;
	}
	
   
}
