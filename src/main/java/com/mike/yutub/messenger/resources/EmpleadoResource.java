/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.resources;

import com.mike.yutub.messenger.model.Empleado;
import com.mike.yutub.messenger.model.Message;
import com.mike.yutub.messenger.resources.beans.EmpleadoFilterBean;
import com.mike.yutub.messenger.service.EmpleadoService;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author GERALVARADO
 */
@Path("/empleados")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class EmpleadoResource {

    @EJB
    EmpleadoService empleadoService;

    // GET METHODS
    @GET
    public List<Empleado> getEmps(@BeanParam EmpleadoFilterBean filterBean) {

        if (filterBean.getStart() > 0 && filterBean.getSize() > 0) {
            return empleadoService.getEmpsPaginated(filterBean.getStart(), filterBean.getSize());
        }

        if (filterBean.getCrPlaza() != null) {
            return empleadoService.getAllEmpsForCrPlaza(filterBean.getCrPlaza());
        }
        if (filterBean.getCrTienda() != null) {
            return empleadoService.getAllEmpsForCrTienda(filterBean.getCrTienda());
        }
        return empleadoService.getAllEmps();
    }

    @GET
    @Path("/{empleadoID}")
    public Empleado getMessage(@PathParam("empleadoID") String id) {
        return empleadoService.getEmpById(id);
    }

    @GET
    @Path("{year}/{month}/{day}")
    public List<Empleado> searchEmpsByBirthDate(
            @PathParam("year") int year,
            @PathParam("month") int month,
            @PathParam("day") int day) {

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, day);
        Date date = calendar.getTime();
        System.out.println(date);
        return empleadoService.getEmpsByBirthDate(date);

    }
    
    @Path("/{empleadoID}/SubResource")
    public SubResource getpro(){
        return new SubResource();
    }

//DELETE METHODS
    @DELETE
    @Path("/{empleadoID}")
    public void deleteMessage(@PathParam("empleadoID") String id) {
        empleadoService.removeEmp(id);
    }
//POST METHODS

    @POST
    public Empleado addEmp(Empleado empleado) {
        return empleadoService.addEmp(empleado);
    }
//PUT METHODS

    @PUT
    @Path("/{empleadoID}")
    public Empleado editEmp(@PathParam("empleadoID") String id, Empleado empleado) {
        empleado.setIdEmpleado(id);
        return empleadoService.editEmp(empleado);
    }
}
