package dev.jdleiva.futsalback.controller;

import dev.jdleiva.futsalback.domain.AccionEntity;
import dev.jdleiva.futsalback.dto.Accion;
import dev.jdleiva.futsalback.repository.AcionRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class AccionController {

    private final AcionRepository accionrepository;

    public AccionController(AcionRepository accionrepository) {
        this.accionrepository = accionrepository;
    }

    @PostMapping("/notificar/cambio")
    ResponseEntity<?> saveAction(@RequestBody Accion accion, HttpEntity<Accion> request){
        AccionEntity accionEntity = new AccionEntity();
        accionEntity.setDorsal(accion.getDorsal());
        accionEntity.setDorsalEntrada(accion.getDorsalEntrada());
        accionEntity.setAccion(accion.getAccion());
        accionEntity.setTiempo(accion.getTiempo());
        accionEntity.setUserId(accion.getUserId());
        accionEntity.setCreated(new Timestamp(System.currentTimeMillis()));
        AccionEntity save = accionrepository.save(accionEntity);
        return ResponseEntity.created(null).body(save);
    }

}
