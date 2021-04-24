package br.inatel.soa.pos;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path ("alo")
public class ServicoInatel
{

    @GET
    @Produces ("application/json")
    @Path ("teste/{nome}")
    public String aloWorld(@PathParam ("nome") String name)
    {
        return "{\"Hello World\":\"" + name + "\"}";
    }

    @POST
    @Produces ("application/json")
    @Path ("teste/{nome}")
    public String alo2World(@PathParam ("nome") String name)
    {
        return "{\"Hello World 2\":\"" + name + "\"}";
    }

}
