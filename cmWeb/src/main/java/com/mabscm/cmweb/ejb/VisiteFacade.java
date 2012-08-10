/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mabscm.cmweb.ejb;

import com.mabscm.cmentities.model.Visite;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author abdel
 */
@Stateless
public class VisiteFacade extends AbstractFacade<Visite> {
    @PersistenceContext(unitName = "cmdbUnit")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VisiteFacade() {
        super(Visite.class);
    }
    
}
