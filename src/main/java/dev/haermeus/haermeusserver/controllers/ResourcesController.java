package dev.haermeus.haermeusserver.controllers;


import dev.haermeus.haermeusserver.dto.resource.FullResourceDTO;
import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.service.ResourcesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
@RequiredArgsConstructor
public class ResourcesController {

    final ResourcesService resourcesService;

    @GetMapping("/plain")
    PlainResourceDTO getPlainResourceById(@RequestParam Long id) {
        return resourcesService.getPlainResource(id);
    }

    @GetMapping("/full")
    FullResourceDTO getFullResourceById(@RequestParam Long id) {
        return resourcesService.getFullResource(id);
    }
}
