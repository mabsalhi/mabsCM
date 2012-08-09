package com.mabs.cm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the medicament database table.
 * 
 */
@Entity
public class Medicament implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idMedicament;

	private String classeTherapeutique;

	private String composition;

	private String designation;

	private String forme;

	private String indcation;

	private String presentation;

	//bi-directional many-to-one association to Prescription
	@OneToMany(mappedBy="medicament")
	private List<Prescription> prescriptions;

	public Medicament() {
	}

	public int getIdMedicament() {
		return this.idMedicament;
	}

	public void setIdMedicament(int idMedicament) {
		this.idMedicament = idMedicament;
	}

	public String getClasseTherapeutique() {
		return this.classeTherapeutique;
	}

	public void setClasseTherapeutique(String classeTherapeutique) {
		this.classeTherapeutique = classeTherapeutique;
	}

	public String getComposition() {
		return this.composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getDesignation() {
		return this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getForme() {
		return this.forme;
	}

	public void setForme(String forme) {
		this.forme = forme;
	}

	public String getIndcation() {
		return this.indcation;
	}

	public void setIndcation(String indcation) {
		this.indcation = indcation;
	}

	public String getPresentation() {
		return this.presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public List<Prescription> getPrescriptions() {
		return this.prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

}