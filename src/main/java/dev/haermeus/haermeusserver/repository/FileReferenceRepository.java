package dev.haermeus.haermeusserver.repository;

import dev.haermeus.haermeusserver.entity.FileReferenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileReferenceRepository extends JpaRepository<FileReferenceEntity, Long> {
}
