package dev.jdleiva.futsalback.dto;

import java.sql.Timestamp;
import java.time.LocalDate;

public record JugadorDTO(
        Long id,
        Integer dorsal,
        String nombre,
        String apodo,
        LocalDate fechaNacimiento
) {
}
