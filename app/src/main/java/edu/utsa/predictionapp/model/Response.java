package edu.utsa.predictionapp.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Response {
    private String responseText;
    private ArrayList<Person> theyWhoResponded;

    public Response(String response, ArrayList<Person> person){
        responseText = response;
        theyWhoResponded = person;
    }
}
