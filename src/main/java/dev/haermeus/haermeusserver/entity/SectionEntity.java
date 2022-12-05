package dev.haermeus.haermeusserver.entity;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class SectionEntity {
    private Long id;
    @ToString.Exclude @EqualsAndHashCode.Exclude private SectionEntity parent;
    private String title;
}
