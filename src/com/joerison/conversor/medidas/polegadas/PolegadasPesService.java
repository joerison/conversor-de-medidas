package com.joerison.conversor.medidas.polegadas;

/**
 * @author Joerison Silva
 * Description: Esse servico converte de polegadas para pes.
 */

import com.joerison.conversor.util.ConversorUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static com.joerison.conversor.util.ConversorTipoEnum.POLEGADAS_PARA_PES;

@Path("/polegadaspes")
public class PolegadasPesService
{

    @GET
    @Produces("application/json")
    public Response converterPolegadasParaPes()
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_PES, "Polegadas", "Pes", 1f);

        return Response.status(200).entity(result).build();
    }

    @Path("{polegadas}")
    @GET
    @Produces("application/json")
    public Response converterPolegadasParaPes(@PathParam("polegadas") float polegadas)
    {

        String result = ConversorUtil.converter(POLEGADAS_PARA_PES, "Polegadas", "Pes", polegadas);

        return Response.status(200).entity(result).build();
    }
}