package br.com.albinomoreira.veiculosapi.exception;

import br.com.albinomoreira.veiculosapi.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ControllerAdvice(basePackages = "br.com.albinomoreira.veiculosapi.controller")
public class VeiculoControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(VeiculoNotFoundException.class)
    public ErrorDTO handleUserNotFound(VeiculoNotFoundException veiculoNotFoundException){
        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());
        errorDTO.setMessage("Veiculo não encontrado.");
        errorDTO.setTimestamp(new Date());
        return errorDTO;
    }
}
