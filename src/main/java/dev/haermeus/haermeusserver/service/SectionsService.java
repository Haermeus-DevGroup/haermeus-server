package dev.haermeus.haermeusserver.service;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;

import java.util.List;

public interface SectionsService {

    PlainSectionDTO getPlainSection(Long id);
    List<PlainSectionDTO> getPlainChildrenSections(Long id);
    List<PlainResourceDTO> getPlainChildrenResources(Long id);



}
