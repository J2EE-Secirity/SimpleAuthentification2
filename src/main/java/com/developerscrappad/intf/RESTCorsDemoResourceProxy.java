package com.developerscrappad.intf;

/**
 * Created by alexandr on 12.05.15.
 */
import javax.ejb.Local;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Local
@Path( "rest-cors-demo" )
public interface RESTCorsDemoResourceProxy extends Serializable {

    @GET
    @Path( "get-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response getMethod();

    @PUT
    @Path( "put-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response putMethod();

    @POST
    @Path( "post-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response postMethod();

    @DELETE
    @Path( "delete-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response deleteMethod();
}