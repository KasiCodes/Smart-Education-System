package com.kasiCodes.Smart.Education.System.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "submission")
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "submission_url", nullable = false)
    private String submissionUrl;

    @Column(name = "submission_status", nullable = false)
    private boolean submissionStatus = false;

    @Column(name = "submission_date", nullable = false)
    private LocalDate submissionDate;

    @Column(name = "score", nullable = false)
    private Integer score;

    public Submission(Long id, String submissionUrl, boolean submissionStatus, LocalDate submissionDate, Integer score) {
        this.id = id;
        this.submissionUrl = submissionUrl;
        this.submissionStatus = submissionStatus;
        this.submissionDate = submissionDate;
        this.score = score;
    }

    public Submission(String submissionUrl, boolean submissionStatus, LocalDate submissionDate, Integer score) {
        this.submissionUrl = submissionUrl;
        this.submissionStatus = submissionStatus;
        this.submissionDate = submissionDate;
        this.score = score;
    }

    public Submission(String submissionUrl, boolean submissionStatus, LocalDate submissionDate) {
        this.submissionUrl = submissionUrl;
        this.submissionStatus = submissionStatus;
        this.submissionDate = submissionDate;
    }
    

    public Submission(Long id, String submissionUrl, boolean submissionStatus, LocalDate submissionDate) {
        this.id = id;
        this.submissionUrl = submissionUrl;
        this.submissionStatus = submissionStatus;
        this.submissionDate = submissionDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "quiz_id", nullable = false)
    private Quiz quiz;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "student_id", nullable = false)
    private User student;
    
    public Submission() {
    }

    public Submission(String submissionUrl, Quiz quiz) {
        this.submissionUrl = submissionUrl;
        this.quiz = quiz;
    }

    public Submission(Long id, String submissionUrl, Quiz quiz) {
        this.id = id;
        this.submissionUrl = submissionUrl;
        this.quiz = quiz;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubmissionUrl() {
        return submissionUrl;
    }

    public void setSubmissionUrl(String submissionUrl) {
        this.submissionUrl = submissionUrl;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
    
    
}
