package com.joerison.conversor.util;

import org.json.JSONObject;

public class ConversorUtil
{

    public static String converter(ConversorTipoEnum conversorTipoEnum, String de, String para, Float value)
    {
        Float resultado = null;
        switch (conversorTipoEnum) {
            case METROS_PARA_PES:
            case METROS_PARA_POLEGADAS:
            case PES_PARA_POLEGADAS:
                resultado = value * conversorTipoEnum.getValor();
                break;
            case PES_PARA_METROS:
            case POLEGADAS_PARA_METROS:
            case POLEGADAS_PARA_PES:
                resultado = value / conversorTipoEnum.getValor();
                break;
        }

        JSONObject jsonObject = new JSONObject();
        jsonObject.put(de, value);
        jsonObject.put(para, resultado);

        return "@Produces(\"application/json\")" + jsonObject;
    }

}


