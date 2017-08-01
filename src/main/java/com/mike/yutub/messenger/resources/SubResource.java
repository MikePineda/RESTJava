package com.mike.yutub.messenger.resources;

import com.mike.yutub.messenger.model.Empleado;
import com.mike.yutub.messenger.service.EmpleadoService;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class SubResource {

    @EJB
    EmpleadoService empleadoService;

    @GET
    @Path("/{subId}")
    public String getInfoExample(@PathParam("empleadoID") String empleadoID, @PathParam("subId") long subId) {
    return "Method to return empleado id: "+empleadoID + " and his subresource: "+ subId; 
    }
}
