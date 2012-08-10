/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmentities.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abdel
 */
@Entity
@Table(name = "medicament")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medicament.findAll", query = "SELECT m FROM Medicament m"),
    @NamedQuery(name = "Medicament.findByIdMedicament", query = "SELECT m FROM Medicament m WHERE m.idMedicament = :idMedicament"),
    @NamedQuery(name = "Medicament.findByDesignation", query = "SELECT m FROM Medicament m WHERE m.designation = :designation"),
    @NamedQuery(name = "Medicament.findByComposition", query = "SELECT m FROM Medicament m WHERE m.composition = :composition"),
    @NamedQuery(name = "Medicament.findByForme", query = "SELECT m FROM Medicament m WHERE m.forme = :forme"),
    @NamedQuery(name = "Medicament.findByPresentation", query = "SELECT m FROM Medicament m WHERE m.presentation = :presentation"),
    @NamedQuery(name = "Medicament.findByClasseTherapeutique", query = "SELECT m FROM Medicament m WHERE m.classeTherapeutique = :classeTherapeutique"),
    @NamedQuery(name = "Medicament.findByIndcation", query = "SELECT m FROM Medicament m WHERE m.indcation = :indcation")})
public class Medicament implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idMedicament")
    private Integer idMedicament;
    @Column(name = "designation")
    private String designation;
    @Column(name = "composition")
    private String composition;
    @Column(name = "forme")
    private String forme;
    @Column(name = "presentation")
    private String presentation;
    @Column(name = "classeTherapeutique")
    private String classeTherapeutique;
    @Column(name = "indcation")
    private String indcation;
    @OneToMany(mappedBy = "idMedicament")
    private List<Prescription> prescriptionList;

    public Medicament() {
    }

    public Medicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public Integer getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Integer idMedicament) {
        this.idMedicament = idMedicament;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getClasseTherapeutique() {
        return classeTherapeutique;
    }

    public void setClasseTherapeutique(String classeTherapeutique) {
        this.classeTherapeutique = classeTherapeutique;
    }

    public String getIndcation() {
        return indcation;
    }

    public void setIndcation(String indcation) {
        this.indcation = indcation;
    }

    @XmlTransient
    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMedicament != null ? idMedicament.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medicament)) {
            return false;
        }
        Medicament other = (Medicament) object;
        if ((this.idMedicament == null && other.idMedicament != null) || (this.idMedicament != null && !this.idMedicament.equals(other.idMedicament))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mabscm.cmentities.model.Medicament[ idMedicament=" + idMedicament + " ]";
    }
    
}
