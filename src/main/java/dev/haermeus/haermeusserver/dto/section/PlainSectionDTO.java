package dev.haermeus.haermeusserver.dto.section;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlainSectionDTO {

    private String title;
    private Long id;

    public PlainSectionDTO(String title, Long id) {
    }
}
