package com.example.blazepersistence.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;

    protected String titleNew;

    protected String contentNew;

    @ManyToOne(fetch = FetchType.LAZY)
    private Person author;

    @ElementCollection
    @Column(name = "test_collection")
    @CollectionTable(name = "post_test_collection", joinColumns = @JoinColumn(name = "owner_id"))
    private Set<String> testCollection = new LinkedHashSet<>();


    public Set<String> getTestCollection() {
        return testCollection;
    }

    public void setTestCollection(Set<String> testCollection) {
        this.testCollection = testCollection;
    }

    public Post() {
    }

    public Post(String title, String content, Person author) {
        this.titleNew = title;
        this.contentNew = content;
        this.author = author;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleNew() {
        return titleNew;
    }

    public void setTitleNew(String titleNew) {
        this.titleNew = titleNew;
    }

    public String getContentNew() {
        return contentNew;
    }

    public void setContentNew(String contentNew) {
        this.contentNew = contentNew;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", title='" + titleNew + '\'' +
                ", content='" + contentNew + '\'' +
                '}';
    }
}