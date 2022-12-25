package dev.haermeus.haermeusserver.service.impl;

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
        return PlainResourceDTO("Hello world", id);;
    }
}
