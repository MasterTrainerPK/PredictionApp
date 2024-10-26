package edu.utsa.predictionapp.model;
import java.util.ArrayList;

public class PredictionMain{
    private final ArrayList<String> predictPhrases;

    public PredictionMain(ArrayList<String> phrases){
        predictPhrases = phrases;
    }

    public PredictionMain(){
        predictPhrases = null;
    }

    public void addPrediction(String p){
        predictPhrases.add(p);
    }
    
    public String getQuestion(int i){
        return predictPhrases.get(i);
    }
}
