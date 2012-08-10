/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmentities.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abdel
 */
@Entity
@Table(name = "visite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Visite.findAll", query = "SELECT v FROM Visite v"),
    @NamedQuery(name = "Visite.findByIdVisite", query = "SELECT v FROM Visite v WHERE v.idVisite = :idVisite"),
    @NamedQuery(name = "Visite.findByDateVisite", query = "SELECT v FROM Visite v WHERE v.dateVisite = :dateVisite"),
    @NamedQuery(name = "Visite.findByType", query = "SELECT v FROM Visite v WHERE v.type = :type"),
    @NamedQuery(name = "Visite.findByMotifs", query = "SELECT v FROM Visite v WHERE v.motifs = :motifs")})
public class Visite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idVisite")
    private Integer idVisite;
    @Column(name = "dateVisite")
    @Temporal(TemporalType.DATE)
    private Date dateVisite;
    @Column(name = "type")
    private String type;
    @Column(name = "motifs")
    private String motifs;
    @JoinColumn(name = "idDossier", referencedColumnName = "idDossier")
    @ManyToOne(optional = false)
    private Dossierpatient idDossier;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idVisite")
    private List<Prescription> prescriptionList;

    public Visite() {
    }

    public Visite(Integer idVisite) {
        this.idVisite = idVisite;
    }

    public Integer getIdVisite() {
        return idVisite;
    }

    public void setIdVisite(Integer idVisite) {
        this.idVisite = idVisite;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMotifs() {
        return motifs;
    }

    public void setMotifs(String motifs) {
        this.motifs = motifs;
    }

    public Dossierpatient getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Dossierpatient idDossier) {
        this.idDossier = idDossier;
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
        hash += (idVisite != null ? idVisite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Visite)) {
            return false;
        }
        Visite other = (Visite) object;
        if ((this.idVisite == null && other.idVisite != null) || (this.idVisite != null && !this.idVisite.equals(other.idVisite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mabscm.cmentities.model.Visite[ idVisite=" + idVisite + " ]";
    }
    
}
