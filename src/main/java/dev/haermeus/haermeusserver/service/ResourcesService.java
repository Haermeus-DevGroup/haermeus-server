package dev.haermeus.haermeusserver.service;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;

public interface ResourcesService {

    PlainResourceDTO getPlainResource(Long id);

}
