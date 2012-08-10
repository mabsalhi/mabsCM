package com.mabs.cm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prescription database table.
 * 
 */
@Entity
public class Prescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idPrescription;

	private String detailPrise;

	private int quantite;

	//bi-directional many-to-one association to Visite
	@ManyToOne
	@JoinColumn(name="idVisite")
	private Visite visite;

	//bi-directional many-to-one association to Medicament
	@ManyToOne
	@JoinColumn(name="idMedicament")
	private Medicament medicament;

	public Prescription() {
	}

	public int getIdPrescription() {
		return this.idPrescription;
	}

	public void setIdPrescription(int idPrescription) {
		this.idPrescription = idPrescription;
	}

	public String getDetailPrise() {
		return this.detailPrise;
	}

	public void setDetailPrise(String detailPrise) {
		this.detailPrise = detailPrise;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Visite getVisite() {
		return this.visite;
	}

	public void setVisite(Visite visite) {
		this.visite = visite;
	}

	public Medicament getMedicament() {
		return this.medicament;
	}

	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}

}