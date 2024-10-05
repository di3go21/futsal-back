package dev.jdleiva.futsalback.repository;

import dev.jdleiva.futsalback.domain.AccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcionRepository extends JpaRepository<AccionEntity, Long> {
}
