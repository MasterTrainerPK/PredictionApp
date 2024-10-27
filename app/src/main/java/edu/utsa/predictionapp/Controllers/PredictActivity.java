package edu.utsa.predictionapp.Controllers;

import static android.os.Build.VERSION_CODES.R;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import java.util.ArrayList;
import java.util.Objects;

import edu.utsa.predictionapp.model.Response;

import edu.utsa.predictionapp.model.Person;



public class PredictActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R);
        TextInputLayout textInputLayout = findViewById(R);
        String text = String.valueOf(Objects.requireNonNull(textInputLayout.getEditText()).getText());
        
        super.onCreate(savedInstanceState);
        ArrayList<Person> person = new ArrayList<>();
        Response response = new Response(text, person);


        setContentView(R);
    }
}