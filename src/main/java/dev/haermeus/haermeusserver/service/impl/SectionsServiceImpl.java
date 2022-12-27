package dev.haermeus.haermeusserver.service.impl;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import dev.haermeus.haermeusserver.repository.ResourceRepository;
import dev.haermeus.haermeusserver.repository.SectionRepository;
import dev.haermeus.haermeusserver.service.SectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SectionsServiceImpl implements SectionService {

    final SectionRepository sectionRepo;
    final ResourceRepository resourceRepo;
    @Override
    public PlainSectionDTO getPlainSection(Long id) {
        return new PlainSectionDTO("Hello world", id);
    }

    @Override
    public List<PlainSectionDTO> getPlainChildrenSections(Long id) {
        return Collections.emptyList();
    }

    @Override
    public List<PlainResourceDTO> getPlainChildrenResources(Long id) {
        return Collections.emptyList();
    }
}
