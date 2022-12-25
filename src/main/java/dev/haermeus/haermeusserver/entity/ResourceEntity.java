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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id")
    @ToString.Exclude @EqualsAndHashCode.Exclude private SectionEntity parent;
    @Column(name = "title")
    private String title;
    @Column(name = "content")
    private String content;
    @OneToMany(fetch = FetchType.LAZY)
    @ToString.Exclude @EqualsAndHashCode.Exclude private List<FileReferenceEntity> files;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cover_file_id")
    @ToString.Exclude @EqualsAndHashCode.Exclude private FileReferenceEntity cover;
}
