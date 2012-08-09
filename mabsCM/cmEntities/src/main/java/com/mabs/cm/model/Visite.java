package com.mabs.cm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the visite database table.
 * 
 */
@Entity
public class Visite implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVisite;

	@Temporal(TemporalType.DATE)
	private Date dateVisite;

	private String motifs;

	private String type;

	//bi-directional many-to-one association to Prescription
	@OneToMany(mappedBy="visite")
	private List<Prescription> prescriptions;

	//bi-directional many-to-one association to Dossierpatient
	@ManyToOne
	@JoinColumn(name="idDossier")
	private Dossierpatient dossierpatient;

	public Visite() {
	}

	public int getIdVisite() {
		return this.idVisite;
	}

	public void setIdVisite(int idVisite) {
		this.idVisite = idVisite;
	}

	public Date getDateVisite() {
		return this.dateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	public String getMotifs() {
		return this.motifs;
	}

	public void setMotifs(String motifs) {
		this.motifs = motifs;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Prescription> getPrescriptions() {
		return this.prescriptions;
	}

	public void setPrescriptions(List<Prescription> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public Dossierpatient getDossierpatient() {
		return this.dossierpatient;
	}

	public void setDossierpatient(Dossierpatient dossierpatient) {
		this.dossierpatient = dossierpatient;
	}

}