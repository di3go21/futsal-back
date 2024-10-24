package dev.jdleiva.futsalback.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Table(name = "jugador")
@Data
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "jugador_seq_generator")
    @SequenceGenerator(name = "jugador_seq_generator", sequenceName = "jugador_seq", allocationSize = 1)
    private Long id;

    private Integer dorsal;
    private String nombre;
    private String apodo;
    private LocalDate fechaNacimiento;

    private Timestamp created;
}
