package br.com.albinomoreira.veiculosapi.dto;

import lombok.Data;

import java.util.Date;

@Data
public class ErrorDTO {
    private int status;
    private String message;
    private Date timestamp;
}
