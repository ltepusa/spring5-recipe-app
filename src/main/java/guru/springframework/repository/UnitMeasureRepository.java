package guru.springframework.repository;

import guru.springframework.model.UnitMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

import guru.springframework.model.UnitMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitMeasureRepository extends CrudRepository<UnitMeasure, Long> {

    Optional<UnitMeasure> findByDescription(String description);
}
