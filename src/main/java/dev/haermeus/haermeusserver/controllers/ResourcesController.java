package dev.haermeus.haermeusserver.controllers;


import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class ResourcesController {

    @GetMapping("/plain")
    PlainResourceDTO getPlainResourceById(@RequestParam Long id) {
        return new PlainResourceDTO("Hello world", id);
    }

}
