package com.mabs.cm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPersonne;

	private String adresse;

	private String cin;

	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	private String nom;

	private int numTelephonne;

	@Lob
	private byte[] photo;

	private String prenom;

	private byte sexe;

	private String ville;

	//bi-directional many-to-one association to Dossierpatient
	@OneToMany(mappedBy="personne")
	private List<Dossierpatient> dossierpatients;

	public Personne() {
	}

	public int getIdPersonne() {
		return this.idPersonne;
	}

	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCin() {
		return this.cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public Date getDateNaissance() {
		return this.dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNumTelephonne() {
		return this.numTelephonne;
	}

	public void setNumTelephonne(int numTelephonne) {
		this.numTelephonne = numTelephonne;
	}

	public byte[] getPhoto() {
		return this.photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public byte getSexe() {
		return this.sexe;
	}

	public void setSexe(byte sexe) {
		this.sexe = sexe;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<Dossierpatient> getDossierpatients() {
		return this.dossierpatients;
	}

	public void setDossierpatients(List<Dossierpatient> dossierpatients) {
		this.dossierpatients = dossierpatients;
	}

}