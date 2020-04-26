package com.joerison.conversor.medidas.metros;

/**
 * @author Joerison Silva
 * Description: Esse servico converte de metros para polegadas.
 */

import com.joerison.conversor.util.ConversorUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static com.joerison.conversor.util.ConversorTipoEnum.METROS_PARA_POLEGADAS;

@Path("/metrospolegadas")
public class MetrosPolegadasService
{

    @GET
    @Produces("application/json")
    public Response converterMetrosParaPolegadas()
    {
        String result = ConversorUtil.converter(METROS_PARA_POLEGADAS, "Metros", "Polegadas", 1f);

        return Response.status(200).entity(result).build();
    }

    @Path("{metros}")
    @GET
    @Produces("application/json")
    public Response converterMetrosParaPolegadas(@PathParam("metros") float metros)
    {
        String result = ConversorUtil.converter(METROS_PARA_POLEGADAS, "Metros", "Polegadas", metros);
        return Response.status(200).entity(result).build();
    }
}