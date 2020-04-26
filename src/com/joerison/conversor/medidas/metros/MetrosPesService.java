package com.joerison.conversor.medidas.metros;

/**
 * @author Joerison Silva
 * Description: Esse servico converte de metros para pes.
 */

import com.joerison.conversor.util.ConversorUtil;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import static com.joerison.conversor.util.ConversorTipoEnum.METROS_PARA_PES;

@Path("/metrospes")
public class MetrosPesService
{

    @GET
    @Produces("application/json")
    public Response converterMetrosParaPes()
    {
        String result = ConversorUtil.converter(METROS_PARA_PES, "Metros", "Pes", 1f);
        return Response.status(200).entity(result).build();
    }

	@Path("{metros}")
    @GET
    @Produces("application/json")
    public Response converterMetrosParaPes(@PathParam("metros") float metros)
    {
        String result = ConversorUtil.converter(METROS_PARA_PES, "Metros", "Pes", metros);
        return Response.status(200).entity(result).build();
    }
}