package dev.haermeus.haermeusserver.service.impl;

import dev.haermeus.haermeusserver.dto.resource.FullResourceDTO;
import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.entity.ResourceEntity;
import dev.haermeus.haermeusserver.entity.SectionEntity;
import dev.haermeus.haermeusserver.repository.ResourceRepository;
import dev.haermeus.haermeusserver.service.ResourcesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ResourcesServiceImpl implements ResourcesService {

    final ResourceRepository resourceRepo;
    @Override
    public PlainResourceDTO getPlainResource(Long id) {
        ResourceEntity res = resourceRepo.findById(id).orElseThrow();
        return new PlainResourceDTO(
                res.getId(),
                Optional.ofNullable(res.getParent()).map(SectionEntity::getId).orElse(-1L),
                res.getTitle());
    }

    @Override
    public FullResourceDTO getFullResource(Long id) {
        return resourceRepo.findById(id)
                .map(res -> new FullResourceDTO(
                        res.getId(),
                        Optional.ofNullable(res.getParent()).map(SectionEntity::getId).orElse(-1L),
                        res.getTitle(),
                        res.getContent()
                ))
                .orElseThrow();
    }

}
