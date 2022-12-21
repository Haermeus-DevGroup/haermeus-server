package dev.haermeus.haermeusserver.repository;

import dev.haermeus.haermeusserver.entity.ResourceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResourceRepository extends JpaRepository<ResourceEntity, Long> {
}
