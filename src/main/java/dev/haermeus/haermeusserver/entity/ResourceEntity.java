package dev.haermeus.haermeusserver.entity;

import java.util.List;

public class ResourceEntity {

    protected Long id;
    protected SectionEntity parent;
    protected String title;
    protected String content;
    protected List<FileReferenceEntity> files;
    protected FileReferenceEntity cover;

    public ResourceEntity(Long id, SectionEntity parent, String title, String content, List<FileReferenceEntity> files,
                          FileReferenceEntity cover){
        this.id = id;
        this.parent = parent;
        this.title = title;
        this.content = content;
        this.files = files;
        this.cover = cover;
    }

    public Long getId() {
        return id;
    }

    public SectionEntity getParent() {
        return parent;
    }

    public void setParent(SectionEntity parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<FileReferenceEntity> getFiles() {
        return files;
    }

    public void setFiles(List<FileReferenceEntity> files) {
        this.files = files;
    }

    public FileReferenceEntity getCover() {
        return cover;
    }

    public void setCover(FileReferenceEntity cover) {
        this.cover = cover;
    }
}
