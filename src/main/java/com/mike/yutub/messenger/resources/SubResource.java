package com.mike.yutub.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;


@Path("/")
public class SubResource {
   
    @GET
    @Path("/{subId}")
    public String getInfoExample(@PathParam("empleadoID") long empleadoID,@PathParam("subId") long subId ){
        return "Method to return empleado id: "+empleadoID + " and his subresource: "+ subId; 
    }
}
