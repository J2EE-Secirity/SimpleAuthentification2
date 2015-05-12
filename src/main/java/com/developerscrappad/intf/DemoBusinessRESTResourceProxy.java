package com.developerscrappad.intf;

/**
 * Created by alexandr on 12.05.15.
 */
import javax.ejb.Local;
import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;

@Local
@Path( "demo-business-resource" )
public interface DemoBusinessRESTResourceProxy extends Serializable {

    @POST
    @Path( "login" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response login(
            @Context HttpHeaders httpHeaders,
            @FormParam( "username" ) String username,
            @FormParam( "password" ) String password );

    @GET
    @Path( "demo-get-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response demoGetMethod();

    @POST
    @Path( "demo-post-method" )
    @Produces( MediaType.APPLICATION_JSON )
    public Response demoPostMethod();

    @POST
    @Path( "logout" )
    public Response logout(
            @Context HttpHeaders httpHeaders
    );
}
