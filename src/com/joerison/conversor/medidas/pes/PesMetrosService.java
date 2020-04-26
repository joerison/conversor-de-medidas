package com.joerison.conversor.medidas.pes;

/**
 * @author Joerison Silva
 * Description: Esse servico converte de pes para metros.
 */

import com.joerison.conversor.util.ConversorUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static com.joerison.conversor.util.ConversorTipoEnum.*;

@Path("/pesmetros")
public class PesMetrosService
{

    @GET
    @Produces("application/json")
    public Response converterPesParaMetros()
    {

        String result = ConversorUtil.converter(PES_PARA_METROS, "Pes", "Metros", 1f);

        return Response.status(200).entity(result).build();
    }

    @Path("{pes}")
    @GET
    @Produces("application/json")
    public Response converterPesParaMetros(@PathParam("pes") float pes)
    {

        String result = ConversorUtil.converter(PES_PARA_METROS, "Pes", "Metros", pes);
        return Response.status(200).entity(result).build();
    }
}