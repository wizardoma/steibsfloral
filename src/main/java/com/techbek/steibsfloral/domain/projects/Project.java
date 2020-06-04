package com.techbek.steibsfloral.domain.projects;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String location;
    private int year;
    private String service;

    @Enumerated(value = EnumType.STRING)
    private ProjectType projectType;

    @OneToMany(mappedBy = "project")
    private List<ProjectImage> projectImages;
    private String imageBefore;
    private String imageAfter;
    private String content;

}
