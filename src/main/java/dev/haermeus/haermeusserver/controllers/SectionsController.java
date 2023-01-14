package dev.haermeus.haermeusserver.controllers;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import dev.haermeus.haermeusserver.service.SectionsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/sections")
@RequiredArgsConstructor
public class SectionsController {

    final SectionsService sectionsService;

    @GetMapping("/plain")
    PlainSectionDTO getPlainSectionById(@RequestParam Long id) {
        return sectionsService.getPlainSection(id);
    }

    @GetMapping("/children/sections")
    List<PlainSectionDTO> getChildrenSectionsOfSectionById(@RequestParam Long id) {
        return sectionsService.getPlainChildrenSections(id);
    }

    @GetMapping("/children/resources")
    List<PlainResourceDTO> getChildrenResourcesOfSectionById(@RequestParam Long id) {
        return sectionsService.getPlainChildrenResources(id);
    }

    @GetMapping("/roots")
    List<PlainSectionDTO> getRootSections() {
        return sectionsService.getPlainRootSections();
    }
}
