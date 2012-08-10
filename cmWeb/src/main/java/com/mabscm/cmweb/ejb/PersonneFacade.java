/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmweb.ejb;

import com.mabscm.cmentities.model.Personne;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abdel
 */
@Stateless
public class PersonneFacade extends AbstractFacade<Personne> {
    @PersistenceContext(unitName = "cmdbUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonneFacade() {
        super(Personne.class);
    }
    
}
