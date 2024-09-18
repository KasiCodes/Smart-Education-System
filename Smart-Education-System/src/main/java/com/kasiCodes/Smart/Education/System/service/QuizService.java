package com.kasiCodes.Smart.Education.System.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.kasiCodes.Smart.Education.System.model.Quiz;
import com.kasiCodes.Smart.Education.System.repository.QuizRepository;

@Service
public class QuizService {

    private QuizRepository quizRepository;

    public boolean deleteQuiz(Long id) {
        if (quizRepository.existsById(id)) {
            quizRepository.deleteById(id);
            return true;
        }
        return false;
        
    }

    public Quiz getQuizById(Long id) {
        if (quizRepository.existsById(id)) {
            return quizRepository.findById(id).get();
        }
        return null;
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz createQuiz(Quiz quiz) {

        return quizRepository.save(quiz);
    }

    public Quiz updateQuiz(Long id, Quiz quizDetails) {

        if (quizRepository.existsById(id)) {
            Quiz quiz = quizRepository.findById(id).get();
            quiz.setQuestion(quizDetails.getQuestion());
            quiz.setOption1(quizDetails.getOption1());
            quiz.setOption2(quizDetails.getOption2());
            quiz.setOption3(quizDetails.getOption3());
            quiz.setOption4(quizDetails.getOption4());
            quiz.setAnswer(quizDetails.getAnswer());
            return quizRepository.save(quiz);
        }
        return null;
    }
    
}
