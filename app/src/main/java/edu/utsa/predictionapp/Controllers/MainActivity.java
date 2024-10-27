package edu.utsa.predictionapp.Controllers;

import static android.os.Build.VERSION_CODES.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import edu.utsa.predictionapp.model.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Person person = new Person();
        person.name = "Sample Name";
        super.onCreate(savedInstanceState);
        setContentView(R);
        Button button = findViewById(R);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextInputEditText inputText = findViewById(R);
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
