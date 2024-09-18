package com.kasiCodes.Smart.Education.System.model;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "material")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "material_name", nullable = false)
    private String materialName;

    @Column(name = "material_url", nullable = false)
    private String materialUrl; 

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "course_id", nullable = false)
    private Course course;

    public Material() {
    }
    public Material(String materialName, String materialUrl) {
        this.materialName = materialName;
        this.materialUrl = materialUrl;
    }

    public Material(String materialName, String materialUrl, Course course) {
        this.materialName = materialName;
        this.materialUrl = materialUrl;
        this.course = course;
    }

    public Material(Long id, String materialName, String materialUrl, Course course) {
        this.id = id;
        this.materialName = materialName;
        this.materialUrl = materialUrl;
        this.course = course;
    }

    public Material(Long id, String materialName, String materialUrl) {
        this.id = id;
        this.materialName = materialName;
        this.materialUrl = materialUrl;
    }
    

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMaterialName() {
        return materialName;
    }
    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    public String getMaterialUrl() {
        return materialUrl;
    }
    public void setMaterialUrl(String materialUrl) {
        this.materialUrl = materialUrl;
    }
    
}
