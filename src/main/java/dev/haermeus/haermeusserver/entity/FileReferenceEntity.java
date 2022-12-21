package dev.haermeus.haermeusserver.entity;
import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "file_reference")
public class FileReferenceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_id")
    @ToString.Exclude @EqualsAndHashCode.Exclude private ResourceEntity resource;
    @Column(name = "relative_path")
    private String relativePath;

}
