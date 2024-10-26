package edu.utsa.predictionapp.model;
import java.util.ArrayList;

public class PredictionQuestion {
    public final String questionText;
    public final ArrayList<Response> responses;


    public PredictionQuestion(String phrases, ArrayList<Response> responses){
        questionText = phrases;
        this.responses = responses;
    }
    public PredictionQuestion(){
        questionText = null;
        responses = null;
    }
}
