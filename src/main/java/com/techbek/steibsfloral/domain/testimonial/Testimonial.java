package com.techbek.steibsfloral.domain.testimonial;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "testimonials")
public class Testimonial {

    @Id @GeneratedValue(strategy = GenerationType.AUTO) private long id;
    private String name;
    private String subject;
    private String message;
    private String rating;
    private String imageUrl;
    private String location;
}
