package dev.jdleiva.futsalback.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Entity
@Table(name = "accion")
@Data
public class AccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "accion_seq_generator")
    @SequenceGenerator(name = "accion_seq_generator", sequenceName = "accion_seq", allocationSize = 1)

    private Long id;

    private Integer dorsal;
    private Integer dorsalEntrada;
    private String accion;
    private String tiempo;


    private Timestamp created;
    private String userId;

}
