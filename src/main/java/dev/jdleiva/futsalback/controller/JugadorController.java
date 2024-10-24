package dev.jdleiva.futsalback.controller;

import dev.jdleiva.futsalback.dto.JugadorDTO;
import dev.jdleiva.futsalback.repository.JugadorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JugadorController {

    private final JugadorRepository jugadorRepository;

    public JugadorController(JugadorRepository jugadorRepository) {
        this.jugadorRepository = jugadorRepository;
    }

    @GetMapping("/jugadores")
    public ResponseEntity<?> getJugadores() {
        List<JugadorDTO> jugadores = jugadorRepository.findAll()
                .stream()
                .map(jugador -> {
                    JugadorDTO jugadorDTO = new JugadorDTO(
                            jugador.getId(),
                            jugador.getDorsal(),
                            jugador.getNombre(),
                            jugador.getApodo(),
                            jugador.getFechaNacimiento()
                    );
                    return jugadorDTO;
                })
                .toList();
        return ResponseEntity.ok(jugadores);
    }

}
