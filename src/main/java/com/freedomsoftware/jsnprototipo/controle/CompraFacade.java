/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.freedomsoftware.jsnprototipo.controle;

import com.freedomsoftware.jsnprototipo.modelo.Compra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jeison
 */
@Stateless
public class CompraFacade extends AbstractFacade<Compra> {

    @PersistenceContext(unitName = "com.freedomsoftware_JSNPrototipo_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompraFacade() {
        super(Compra.class);
    }
    
}
