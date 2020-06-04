package com.techbek.steibsfloral.domain.projects;

import com.techbek.steibsfloral.domain.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "project_images")
public class ProjectImage extends AbstractEntity {
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    private Project project;
}
