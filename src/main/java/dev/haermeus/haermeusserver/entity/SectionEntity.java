package dev.haermeus.haermeusserver.entity;

public class SectionEntity {
    private Long id;
    private SectionEntity parent;
    public String title;

    public SectionEntity(SectionEntity parent) {
        this.parent = parent;
    }

    public SectionEntity(SectionEntity parent, String title) {
        // TODO: вставить создание id FileReference
        this(parent);
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public SectionEntity getParent() {
        return parent;
    }

}
