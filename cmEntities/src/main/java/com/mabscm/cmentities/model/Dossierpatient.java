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
@Table(name = "dossierpatient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dossierpatient.findAll", query = "SELECT d FROM Dossierpatient d"),
    @NamedQuery(name = "Dossierpatient.findByIdDossier", query = "SELECT d FROM Dossierpatient d WHERE d.idDossier = :idDossier"),
    @NamedQuery(name = "Dossierpatient.findByPremiereVisite", query = "SELECT d FROM Dossierpatient d WHERE d.premiereVisite = :premiereVisite"),
    @NamedQuery(name = "Dossierpatient.findByGroupeSanguin", query = "SELECT d FROM Dossierpatient d WHERE d.groupeSanguin = :groupeSanguin"),
    @NamedQuery(name = "Dossierpatient.findByAntecedant", query = "SELECT d FROM Dossierpatient d WHERE d.antecedant = :antecedant"),
    @NamedQuery(name = "Dossierpatient.findByMutialiste", query = "SELECT d FROM Dossierpatient d WHERE d.mutialiste = :mutialiste"),
    @NamedQuery(name = "Dossierpatient.findByDivers", query = "SELECT d FROM Dossierpatient d WHERE d.divers = :divers")})
public class Dossierpatient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDossier")
    private Integer idDossier;
    @Column(name = "PremiereVisite")
    @Temporal(TemporalType.DATE)
    private Date premiereVisite;
    @Column(name = "groupeSanguin")
    private String groupeSanguin;
    @Column(name = "antecedant")
    private String antecedant;
    @Column(name = "mutialiste")
    private Boolean mutialiste;
    @Column(name = "divers")
    private String divers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDossier")
    private List<Visite> visiteList;
    @JoinColumn(name = "idPersonne", referencedColumnName = "idPersonne")
    @ManyToOne(optional = false)
    private Personne idPersonne;

    public Dossierpatient() {
    }

    public Dossierpatient(Integer idDossier) {
        this.idDossier = idDossier;
    }

    public Integer getIdDossier() {
        return idDossier;
    }

    public void setIdDossier(Integer idDossier) {
        this.idDossier = idDossier;
    }

    public Date getPremiereVisite() {
        return premiereVisite;
    }

    public void setPremiereVisite(Date premiereVisite) {
        this.premiereVisite = premiereVisite;
    }

    public String getGroupeSanguin() {
        return groupeSanguin;
    }

    public void setGroupeSanguin(String groupeSanguin) {
        this.groupeSanguin = groupeSanguin;
    }

    public String getAntecedant() {
        return antecedant;
    }

    public void setAntecedant(String antecedant) {
        this.antecedant = antecedant;
    }

    public Boolean getMutialiste() {
        return mutialiste;
    }

    public void setMutialiste(Boolean mutialiste) {
        this.mutialiste = mutialiste;
    }

    public String getDivers() {
        return divers;
    }

    public void setDivers(String divers) {
        this.divers = divers;
    }

    @XmlTransient
    public List<Visite> getVisiteList() {
        return visiteList;
    }

    public void setVisiteList(List<Visite> visiteList) {
        this.visiteList = visiteList;
    }

    public Personne getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(Personne idPersonne) {
        this.idPersonne = idPersonne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDossier != null ? idDossier.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dossierpatient)) {
            return false;
        }
        Dossierpatient other = (Dossierpatient) object;
        if ((this.idDossier == null && other.idDossier != null) || (this.idDossier != null && !this.idDossier.equals(other.idDossier))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mabscm.cmentities.model.Dossierpatient[ idDossier=" + idDossier + " ]";
    }
    
}
