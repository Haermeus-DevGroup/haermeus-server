package dev.haermeus.haermeusserver.dto.section;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlainSectionDTO {

    private Long id;
    private Long parentId;
    private String title;

}
