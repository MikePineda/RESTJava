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
        query = controlesEm.createNamedQuery("Empleado.findAll");
        return query.getResultList();
    }

    public Empleado getEmpById(String id) {
        return controlesEm.find(Empleado.class, id);

    }

    public void removeEmp(String id) {
        Empleado emp = controlesEm.find(Empleado.class, id);
        controlesEm.remove(emp);
        controlesEm.flush();
        System.out.println("Borrado");

    }

    public Empleado addEmp(Empleado empleado) {
        controlesEm.persist(empleado);
        controlesEm.flush();
        return empleado;
    }

    public Empleado editEmp(Empleado empleado) {
        controlesEm.merge(empleado);
        controlesEm.flush();
        return empleado;
    }

    public List<Empleado> getAllEmpsForCrPlaza(String crPlaza) {
        query = controlesEm.createNamedQuery("Empleado.findByCrPlaza");
        query.setParameter("crPlaza", crPlaza );
        return query.getResultList();
    }

    public List<Empleado> getAllEmpsForCrTienda(String crTienda) {
        query = controlesEm.createNamedQuery("Empleado.findByCrTienda");
        query.setParameter("crTienda", crTienda );
        return query.getResultList();
    }

    public List<Empleado> getEmpsPaginated(int start, int size) {
        query = controlesEm.createNamedQuery("Empleado.findAll");
        query.setFirstResult(start);
        query.setMaxResults(size);
        return query.getResultList();
    }
}
