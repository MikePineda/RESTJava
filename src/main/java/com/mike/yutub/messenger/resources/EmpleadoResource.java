/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mike.yutub.messenger.resources;

import com.mike.yutub.messenger.model.Empleado;
import com.mike.yutub.messenger.model.Message;
import com.mike.yutub.messenger.service.EmpleadoService;
import java.util.List;
import javax.ejb.EJB;
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

    @GET
    public List<Empleado> getEmps(@QueryParam("crPlaza") String crPlaza,
            @QueryParam("crTienda") String crTienda,
            @QueryParam("start") int start,
            @QueryParam("size") int size) {
        
        if(start > 0 && size > 0 ) return empleadoService.getEmpsPaginated(start,size);
        
        if (crPlaza != null) {
            return empleadoService.getAllEmpsForCrPlaza(crPlaza);
        }
        if (crTienda != null) {
            return empleadoService.getAllEmpsForCrTienda(crTienda);
        }
        return empleadoService.getAllEmps();
    }

    @GET
    @Path("/{empleadoID}")
    public Empleado getMessage(@PathParam("empleadoID") String id) {
        return empleadoService.getEmpById(id);
    }

    @DELETE
    @Path("/{empleadoID}")
    public void deleteMessage(@PathParam("empleadoID") String id) {
        empleadoService.removeEmp(id);
    }

    @POST
    public Empleado addEmp(Empleado empleado) {
        return empleadoService.addEmp(empleado);
    }

    @PUT
    @Path("/{empleadoID}")
    public Empleado editEmp(@PathParam("empleadoID") String id, Empleado empleado) {
        empleado.setIdEmpleado(id);
        return empleadoService.editEmp(empleado);
    }
}
