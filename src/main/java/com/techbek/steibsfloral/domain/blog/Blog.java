package com.techbek.steibsfloral.domain.blog;

import com.techbek.steibsfloral.domain.AbstractEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "blogs")
public class Blog extends AbstractEntity {
    private String title;
    private String content;
    private LocalDate publishDate= LocalDate.now();
    @Enumerated(value = EnumType.STRING)
    private BlogCategory category;
    private String imageUrl;
    private String author;
}
