package dev.haermeus.haermeusserver.controllers;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/sections")
public class SectionsController {

    @GetMapping("/plain")
    PlainSectionDTO getPlainSectionById(@RequestParam Long id) {
        return new PlainSectionDTO("Hello world", id);
    }

    @GetMapping("/children/sections")
    List<PlainSectionDTO> getChildrenSectionsOfSectionById(@RequestParam Long id) {
        return Collections.emptyList();
    }

    @GetMapping("/children/resources")
    List<PlainResourceDTO> getChildrenResourcesOfSectionById(@RequestParam Long id) {
        return Collections.emptyList();
    }
}
