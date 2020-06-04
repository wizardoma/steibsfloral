package com.techbek.steibsfloral.domain.team;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Team {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String duty;
    private String imageUrl;
}
