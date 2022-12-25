package dev.haermeus.haermeusserver.dto.resource;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlainResourceDTO {

    private String title;
    private Long id;

    public PlainResourceDTO(String title, Long id) {
    }
}
