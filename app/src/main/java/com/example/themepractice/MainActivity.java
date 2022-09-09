package com.example.themepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void guessing(View v) {
    EditText viewGuess = findViewById(R.id.userGuess);
    TextView answerText = findViewById(R.id.answer);
    String guess = viewGuess.getText().toString();

    if(guess.equalsIgnoreCase(("fries"))){
        answerText.setText("CORRECT!!");
        } else {
            answerText.setText("Try again");
        }
    }

}