package dev.haermeus.haermeusserver.entity;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ResourceEntity {

    private Long id;
    @ToString.Exclude @EqualsAndHashCode.Exclude private SectionEntity parent;
    private String title;
    private String content;
    @ToString.Exclude @EqualsAndHashCode.Exclude private List<FileReferenceEntity> files;
    @ToString.Exclude @EqualsAndHashCode.Exclude private FileReferenceEntity cover;
}
