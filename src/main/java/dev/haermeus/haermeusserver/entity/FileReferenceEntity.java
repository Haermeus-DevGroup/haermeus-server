package dev.haermeus.haermeusserver.entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class FileReferenceEntity {
    private Long id;
    @ToString.Exclude @EqualsAndHashCode.Exclude private ResourceEntity resource;
    private String relativePath;

}
