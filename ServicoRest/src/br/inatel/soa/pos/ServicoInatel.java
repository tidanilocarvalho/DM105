//**********************************************************************
// Copyright (c) 2021 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
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
