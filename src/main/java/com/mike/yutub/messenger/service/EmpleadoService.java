package com.mike.yutub.messenger.service;

import com.mike.yutub.messenger.model.Empleado;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TemporalType;

@Stateless
public class EmpleadoService {

    private Query query;

    @PersistenceContext(unitName = "CONTROLES")
    private EntityManager controlesEm;

    public List<Empleado> getAllEmps() {
        try {
            query = controlesEm.createNamedQuery("Empleado.findAll");
            query.setMaxResults(15);
            return query.getResultList();
        } catch (java.lang.NullPointerException e) {

            return null;
        }
    }
}
