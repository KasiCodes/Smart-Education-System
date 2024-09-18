package com.kasiCodes.Smart.Education.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kasiCodes.Smart.Education.System.model.Quiz;

@Repository
public interface QuizRepository  extends JpaRepository<Quiz, Long> {

    
   
}
