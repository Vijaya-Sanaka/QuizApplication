package com.quiz;
public class Question {
    // Fields to store the question, options, and correct answer
    private String question;
    private String[] options;
    private int correctAnswer;

    // Constructor to initialize a question with options and the correct answer
    public Question(String question, String[] options, int correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Getter for the question
    public String getQuestion() {
        return question;
    }

    // Getter for the options
    public String[] getOptions() {
        return options;
    }

    // Getter for the correct answer
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
