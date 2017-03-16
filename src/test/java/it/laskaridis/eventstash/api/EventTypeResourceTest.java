package it.laskaridis.eventstash.api;

import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class EventTypeResourceTest extends ResourceTest {

    @Test
    public void GetEventTypeShouldReturnOK() {
        Response response = target.path("/event_types").request(MediaType.APPLICATION_JSON).get();
        Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }

    @Test
    public void DeleteEventTypeShouldReturnOK() {
        Response response = target.path("/event_types/1").request(MediaType.APPLICATION_JSON).delete();
        Assert.assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
}
