package dev.haermeus.haermeusserver.service.impl;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.entity.ResourceEntity;
import dev.haermeus.haermeusserver.repository.ResourceRepository;
import dev.haermeus.haermeusserver.service.ResourcesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ResourcesServiceImpl implements ResourcesService {

    final ResourceRepository resourceRepo;
    @Override
    public PlainResourceDTO getPlainResource(Long id) {
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        ResourceEntity res = resourceRepo.findById(id).orElseThrow();
        return new PlainResourceDTO(res.getTitle(), res.getId());
    }
}
