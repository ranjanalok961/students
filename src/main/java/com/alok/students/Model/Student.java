package com.alok.students.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
@Table(name = "students")
public class Student {
    public Student(){

    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;

    @Email
    @Column(unique = true)
    private String email;

    @NotBlank
    private String course;

    @Min(1)
    private int age;

    public Student(Long id, String name, String email, String course, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.course = course;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}