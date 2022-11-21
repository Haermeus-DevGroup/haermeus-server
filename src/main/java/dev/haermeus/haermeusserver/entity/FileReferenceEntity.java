package dev.haermeus.haermeusserver.entity;

public class FileReferenceEntity {
    private Long id;
    private ResourceEntity resource;
    private String relativePath;

    public FileReferenceEntity(ResourceEntity resource) {
        // TODO: вставить создание id FileReference
        this.resource = resource;
        // TODO: вставить получения пути из id ресурса
    }

    public Long getId() {
        return id;
    }

    public ResourceEntity getResource() {
        return resource;
    }

    public String getRelativePath() {
        return relativePath;
    }

}
