package com.techbek.steibsfloral.domain.dto;

import lombok.Data;

@Data

public class BlogSubmitDto {

    private String title;
    private String content;
    private String category;
    private String imageUrl;
}
