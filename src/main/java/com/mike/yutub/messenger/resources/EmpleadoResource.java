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
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
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
	public List<Empleado> getEmps() {
            System.out.println("pro");
            System.out.println(empleadoService.getAllEmps());
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
}
