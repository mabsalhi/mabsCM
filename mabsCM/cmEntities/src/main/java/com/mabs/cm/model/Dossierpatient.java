package com.mabs.cm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dossierpatient database table.
 * 
 */
@Entity
public class Dossierpatient implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idDossier;

	private String antecedant;

	private String divers;

	private String groupeSanguin;

	private byte mutialiste;

	@Temporal(TemporalType.DATE)
	private Date premiereVisite;

	//bi-directional many-to-one association to Personne
	@ManyToOne
	@JoinColumn(name="idPersonne")
	private Personne personne;

	//bi-directional many-to-one association to Visite
	@OneToMany(mappedBy="dossierpatient")
	private List<Visite> visites;

	public Dossierpatient() {
	}

	public int getIdDossier() {
		return this.idDossier;
	}

	public void setIdDossier(int idDossier) {
		this.idDossier = idDossier;
	}

	public String getAntecedant() {
		return this.antecedant;
	}

	public void setAntecedant(String antecedant) {
		this.antecedant = antecedant;
	}

	public String getDivers() {
		return this.divers;
	}

	public void setDivers(String divers) {
		this.divers = divers;
	}

	public String getGroupeSanguin() {
		return this.groupeSanguin;
	}

	public void setGroupeSanguin(String groupeSanguin) {
		this.groupeSanguin = groupeSanguin;
	}

	public byte getMutialiste() {
		return this.mutialiste;
	}

	public void setMutialiste(byte mutialiste) {
		this.mutialiste = mutialiste;
	}

	public Date getPremiereVisite() {
		return this.premiereVisite;
	}

	public void setPremiereVisite(Date premiereVisite) {
		this.premiereVisite = premiereVisite;
	}

	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	public List<Visite> getVisites() {
		return this.visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

}