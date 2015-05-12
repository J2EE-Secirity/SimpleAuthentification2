package com.developerscrappad.business;

/**
 * Created by alexandr on 12.05.15.
 */
import com.developerscrappad.intf.RESTCorsDemoResourceProxy;
import javax.ejb.Stateless;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.core.Response;

@Stateless( name = "RESTCorsDemoResource", mappedName = "ejb/RESTCorsDemoResource" )
public class RESTCorsDemoResource implements RESTCorsDemoResourceProxy {

    @Override
    public Response getMethod() {
        JsonObjectBuilder jsonObjBuilder = Json.createObjectBuilder();
        jsonObjBuilder.add( "message", "get method ok" );

        JsonObject jsonObj = jsonObjBuilder.build();

        return Response.status( Response.Status.OK ).entity( jsonObj.toString() ).build();
    }

    @Override
    public Response putMethod() {
        JsonObjectBuilder jsonObjBuilder = Json.createObjectBuilder();
        jsonObjBuilder.add( "message", "get method ok" );

        JsonObject jsonObj = jsonObjBuilder.build();

        return Response.status( Response.Status.ACCEPTED ).entity( jsonObj.toString() ).build();
    }

    @Override
    public Response postMethod() {
        JsonObjectBuilder jsonObjBuilder = Json.createObjectBuilder();
        jsonObjBuilder.add( "message", "post method ok" );

        JsonObject jsonObj = jsonObjBuilder.build();

        return Response.status( Response.Status.CREATED ).entity( jsonObj.toString() ).build();
    }

    @Override
    public Response deleteMethod() {
        JsonObjectBuilder jsonObjBuilder = Json.createObjectBuilder();
        jsonObjBuilder.add( "message", "delete method ok" );

        JsonObject jsonObj = jsonObjBuilder.build();

        return Response.status( Response.Status.ACCEPTED ).entity( jsonObj.toString() ).build();
    }
}
