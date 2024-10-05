package dev.jdleiva.futsalback.dto;

import lombok.Data;

@Data
public class Accion {
    private int dorsal;
    private int dorsalEntrada;
    private String accion;
    private String tiempo;
    private String userId;
}
