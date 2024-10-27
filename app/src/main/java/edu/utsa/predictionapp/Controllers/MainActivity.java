package edu.utsa.predictionapp.Controllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;

import edu.utsa.predictionapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        Button button = findViewById(R.id.predictButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextInputEditText inputText = findViewById(R.id.userInput);
                inputText.getText();
                //insert code for when button is pressed
            }
        });

    }
}
