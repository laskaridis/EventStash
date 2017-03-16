package it.laskaridis.eventstash.api;

import it.laskaridis.eventstash.domain.EventType;
import org.json.JSONObject;

import javax.inject.Singleton;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("/event_types")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EventTypeResource {

    @GET
    public Response list() {
        return Response.ok().entity("[]").build();
    }

    @GET
    @Path("{id}")
    public Response show(@PathParam("id") long id) {

        JSONObject json = new JSONObject();
        json.put("id", id);

        return Response.ok().entity(json.toString()).build();
    }

    @POST
    public Response create(EventType type) throws Exception {

        JSONObject response = new JSONObject();
        response.put("result", "OK");

        return Response.ok().entity(type).build();
    }

    @PUT
    @Path("{id}")
    public Response update(@PathParam("id") long id, EventType type) {
        return Response.ok().build();
    }

    @DELETE
    @Path("{id}")
    public Response delete(@PathParam("id") long id) {
        return Response.ok().build();
    }
}
