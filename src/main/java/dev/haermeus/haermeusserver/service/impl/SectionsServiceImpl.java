package dev.haermeus.haermeusserver.service.impl;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import dev.haermeus.haermeusserver.entity.SectionEntity;
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
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return new PlainSectionDTO(section.getTitle(), section.getId());
    }

    @Override
    public List<PlainSectionDTO> getPlainChildrenSections(Long id) {
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return section.getChildSections();
    }

    @Override
    public List<PlainResourceDTO> getPlainChildrenResources(Long id) {
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return section.getResources(); 
    }
}
