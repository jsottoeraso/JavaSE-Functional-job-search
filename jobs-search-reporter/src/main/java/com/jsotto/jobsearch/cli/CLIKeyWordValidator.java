package com.jsotto.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;
import sun.jvm.hotspot.tools.soql.SOQL;

public class CLIKeyWordValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("[a-zA-Z]+[0-9]*$")){
            System.out.println("El criterio de busqueda no es valido");
            throw new ParameterException("Unicamente letras y numeros");
        }
    }
}
