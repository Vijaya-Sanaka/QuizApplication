package com.quiz;
import java.util.Scanner;

public class Quiz {
    // Array of questions for the quiz
    private Question[] questions;

    // Constructor to initialize the quiz with an array of questions
    public Quiz(Question[] questions) {
        this.questions = questions;
    }

    // Method to start the quiz
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Loop through each question
        for (Question q : questions) {
            // Print the question
            System.out.println(q.getQuestion());

            // Print the options
            String[] options = q.getOptions();
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }

            // Get user's answer
            System.out.print("Your answer: ");
            int answer = scanner.nextInt();

            // Check if the answer is correct
            if (answer == q.getCorrectAnswer()) {
                score++;
            }
        }

        // Print the final score
        System.out.println("Quiz finished! Your score: " + score + " out of " + questions.length);
        scanner.close();
    }

    // Main method to run the quiz
    public static void main(String[] args) {
        // Create an array of questions
        Question[] questions = {
            new Question("What is the capital of France?", new String[]{"Berlin", "Madrid", "Paris", "Rome"}, 3),
            new Question("Who invented Java?", new String[]{"James Gosling", "Dennis Ritchie", "Bjarne Stroustrup", "Guido van Rossum"}, 1),
            new Question("What year was Java created?", new String[]{"1995", "1996", "1997", "1998"}, 1),
            new Question("What is the capital of Norway?", new String[]{"Stockholm", "Tokyo", "Paris", "Oslo"}, 4),
            new Question("Who is the author of harry potter novel series?", new String[]{"J K Rowling", "Shakespere", "Bjarne Stroustrup", "Philip Pullman"}, 1),
            new Question("Which is the largest desert in the world?", new String[]{"Thar", "Sahara", "Arabian", "Gobi"}, 2)
        };

        // Create the quiz and start it
        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}
