package dev.jdleiva.futsalback.repository;

import dev.jdleiva.futsalback.domain.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository  extends JpaRepository<Jugador, Long> {
}
