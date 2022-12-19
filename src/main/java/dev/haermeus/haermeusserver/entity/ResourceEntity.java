package dev.haermeus.haermeusserver.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "resource")
public class ResourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ToString.Exclude @EqualsAndHashCode.Exclude private SectionEntity parent;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @ToString.Exclude @EqualsAndHashCode.Exclude private List<FileReferenceEntity> files;
    @ToString.Exclude @EqualsAndHashCode.Exclude private FileReferenceEntity cover;
}
