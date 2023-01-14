package dev.haermeus.haermeusserver.service.impl;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import dev.haermeus.haermeusserver.entity.SectionEntity;
import dev.haermeus.haermeusserver.repository.ResourceRepository;
import dev.haermeus.haermeusserver.repository.SectionRepository;
import dev.haermeus.haermeusserver.service.SectionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class SectionsServiceImpl implements SectionsService {

    final SectionRepository sectionRepo;
    final ResourceRepository resourceRepo;
    @Override
    public PlainSectionDTO getPlainSection(Long id) {
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return new PlainSectionDTO(
                section.getId(),
                Optional.ofNullable(section.getParent()).map(SectionEntity::getId).orElse(null),
                section.getTitle());
    }

    @Override
    public List<PlainSectionDTO> getPlainChildrenSections(Long id) {
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return section.getChildSections().stream()
                .map(x -> new PlainSectionDTO(
                        x.getId(),
                        Optional.ofNullable(x.getParent()).map(SectionEntity::getId).orElse(null),
                        x.getTitle()))
                .toList();
    }

    @Override
    public List<PlainResourceDTO> getPlainChildrenResources(Long id) {
        // если ресурса с таким id нет, то выкинется `NoSuchElementException`
        SectionEntity section = sectionRepo.findById(id).orElseThrow();
        return section.getResources().stream()
                .map(x -> new PlainResourceDTO(
                        x.getId(),
                        Optional.ofNullable(x.getParent()).map(SectionEntity::getId).orElse(null),
                        x.getTitle()))
                .toList();
    }

    @Override
    public List<PlainSectionDTO> getPlainRootSections() {
        List<SectionEntity> rootSections = sectionRepo.getAllByParentIsNull();
        return rootSections.stream()
                .map(x -> new PlainSectionDTO(
                        x.getId(),
                        Optional.ofNullable(x.getParent()).map(SectionEntity::getId).orElse(null),
                        x.getTitle()))
                .toList();
    }

}
