package com.springboot.course.coursemanagementapp.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Course {

    @Id
    private long id;
    private String title;
    private String description;

}