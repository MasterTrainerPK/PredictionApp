package edu.utsa.predictionapp.Controllers;

import android.content.Intent;
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

import edu.utsa.predictionapp.MainActivity2;
import edu.utsa.predictionapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.predictButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextInputEditText inputText = findViewById(R.id.userInput);
                String text = String.valueOf(inputText.getText());
                startActivity(
                        new Intent(MainActivity.this, MainActivity2.class)
                            .putExtra("input", text)
                );
                //insert code for when button is pressed
            }
        });

    }
}
