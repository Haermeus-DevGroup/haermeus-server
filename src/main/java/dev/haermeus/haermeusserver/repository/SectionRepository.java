package dev.haermeus.haermeusserver.repository;

import dev.haermeus.haermeusserver.entity.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<SectionEntity, Long> {
    List<SectionEntity> getAllByParentIsNull(); // Spring сам прочитает название метода и реализует его при запуске
}
