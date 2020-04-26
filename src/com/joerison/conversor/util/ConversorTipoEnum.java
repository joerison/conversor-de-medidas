package com.joerison.conversor.util;

public enum ConversorTipoEnum
{
    METROS_PARA_PES(3.281f),
    METROS_PARA_POLEGADAS(39.37f),
    PES_PARA_METROS(3.281f),
    PES_PARA_POLEGADAS(12f),
    POLEGADAS_PARA_METROS(39.37f),
    POLEGADAS_PARA_PES(12f);

    private final float valor;

    ConversorTipoEnum(float valorOpcao)
    {
        valor = valorOpcao;
    }

    public float getValor()
    {
        return valor;
    }

}
