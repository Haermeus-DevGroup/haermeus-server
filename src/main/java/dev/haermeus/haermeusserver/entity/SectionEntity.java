package dev.haermeus.haermeusserver.entity;

import dev.haermeus.haermeusserver.dto.resource.PlainResourceDTO;
import dev.haermeus.haermeusserver.dto.section.PlainSectionDTO;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "section")
public class SectionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_section_id")
    @ToString.Exclude @EqualsAndHashCode.Exclude private SectionEntity parent;
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<SectionEntity> childSections;
    @OneToMany(mappedBy = "parent", fetch = FetchType.LAZY)
    private List<ResourceEntity> resources;
    @Column(name = "title")
    private String title;

}
