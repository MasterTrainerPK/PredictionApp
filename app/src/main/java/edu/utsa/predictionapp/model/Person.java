package edu.utsa.predictionapp.model;

import java.util.ArrayList;

public class Person {
    public int id;
    public String name;
    public ArrayList<Person> friends;
    public ArrayList<PredictionQuestion> createdQuestions;
    PredictionQuestion createQuestion(String text, ArrayList<Response> responses) {
        PredictionQuestion question = new PredictionQuestion(text, responses);
        createdQuestions.add(question);
        return question;
    }
}
