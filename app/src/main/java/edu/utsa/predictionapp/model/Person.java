package edu.utsa.predictionapp.model;


import java.util.ArrayList;

public class Person {
    public int id;
    public String name;
    public ArrayList<Person> friends = new ArrayList<>();
    public ArrayList<PredictionQuestion> createdQuestions = new ArrayList<>();

    public PredictionQuestion createQuestion(String text, ArrayList<Response> responses) {
        PredictionQuestion question = new PredictionQuestion(text, responses);
        createdQuestions.add(question);
        return question;
    }
}

