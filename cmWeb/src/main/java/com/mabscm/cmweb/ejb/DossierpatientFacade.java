/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmweb.ejb;

import com.mabscm.cmentities.model.Dossierpatient;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abdel
 */
@Stateless
public class DossierpatientFacade extends AbstractFacade<Dossierpatient> {
    @PersistenceContext(unitName = "cmdbUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DossierpatientFacade() {
        super(Dossierpatient.class);
    }
    
}
