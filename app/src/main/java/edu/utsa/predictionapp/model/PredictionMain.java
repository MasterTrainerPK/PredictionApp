package edu.utsa.predictionapp;
import java.util.ArrayList;

public class PredictionMain{
    private ArrayList<String> predictPhrases;

    public PredictionMain(String phrases){
        predictPhrases = phrases;
    }

    public PredictionMain(){
        predictPhrases = null;
    }

    public void addPrediction(String p){
        predictPhrases.add(p);
    }
    
    public getQuestion(int i){
        return predictPhrases.get(i);
    }
}
