package com.kasiCodes.Smart.Education.System.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quiz_name", nullable = false)
    private String quizName;

    @Column(name = "quiz_description", nullable = false)
    private String quizDescription;

    @Column(name = "quiz_duration", nullable = false)
    private int quizDuration;

    @Column(name = "quiz_passing_percentage", nullable = false)
    private int quizPassingPercentage;

    @Column(name = "quiz_status", nullable = false)
    private boolean quizStatus = false;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "course_id", nullable = false)
    private Course course;


    public Quiz() {
    }

    public Quiz(String quizName, String quizDescription, int quizDuration, int quizPassingPercentage) { 
        this.quizName = quizName;
        this.quizDescription = quizDescription;
        this.quizDuration = quizDuration;
        this.quizPassingPercentage = quizPassingPercentage;
    }

    public Quiz(Long id, String quizName, String quizDescription, int quizDuration, int quizPassingPercentage) {
        this.id = id;
        this.quizName = quizName;
        this.quizDescription = quizDescription;
        this.quizDuration = quizDuration;
        this.quizPassingPercentage = quizPassingPercentage;
    }

    public boolean isQuizStatus() {
        return quizStatus;
    }

    public void setQuizStatus(boolean quizStatus) {
        this.quizStatus = quizStatus;
    }   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public String getQuizDescription() {
        return quizDescription;
    }

    
}
