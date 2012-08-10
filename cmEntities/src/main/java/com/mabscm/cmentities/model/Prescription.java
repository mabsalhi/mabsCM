/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmentities.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abdel
 */
@Entity
@Table(name = "prescription")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prescription.findAll", query = "SELECT p FROM Prescription p"),
    @NamedQuery(name = "Prescription.findByIdPrescription", query = "SELECT p FROM Prescription p WHERE p.idPrescription = :idPrescription"),
    @NamedQuery(name = "Prescription.findByQuantite", query = "SELECT p FROM Prescription p WHERE p.quantite = :quantite"),
    @NamedQuery(name = "Prescription.findByDetailPrise", query = "SELECT p FROM Prescription p WHERE p.detailPrise = :detailPrise")})
public class Prescription implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPrescription")
    private Integer idPrescription;
    @Column(name = "quantite")
    private Integer quantite;
    @Column(name = "detailPrise")
    private String detailPrise;
    @JoinColumn(name = "idVisite", referencedColumnName = "idVisite")
    @ManyToOne(optional = false)
    private Visite idVisite;
    @JoinColumn(name = "idMedicament", referencedColumnName = "idMedicament")
    @ManyToOne
    private Medicament idMedicament;

    public Prescription() {
    }

    public Prescription(Integer idPrescription) {
        this.idPrescription = idPrescription;
    }

    public Integer getIdPrescription() {
        return idPrescription;
    }

    public void setIdPrescription(Integer idPrescription) {
        this.idPrescription = idPrescription;
    }

    public Integer getQuantite() {
        return quantite;
    }

    public void setQuantite(Integer quantite) {
        this.quantite = quantite;
    }

    public String getDetailPrise() {
        return detailPrise;
    }

    public void setDetailPrise(String detailPrise) {
        this.detailPrise = detailPrise;
    }

    public Visite getIdVisite() {
        return idVisite;
    }

    public void setIdVisite(Visite idVisite) {
        this.idVisite = idVisite;
    }

    public Medicament getIdMedicament() {
        return idMedicament;
    }

    public void setIdMedicament(Medicament idMedicament) {
        this.idMedicament = idMedicament;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPrescription != null ? idPrescription.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prescription)) {
            return false;
        }
        Prescription other = (Prescription) object;
        if ((this.idPrescription == null && other.idPrescription != null) || (this.idPrescription != null && !this.idPrescription.equals(other.idPrescription))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mabscm.cmentities.model.Prescription[ idPrescription=" + idPrescription + " ]";
    }
    
}
