package com.example.polechudes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class WelcomeActivity extends AppCompatActivity {
    Button startButton;
    EditText nameInput;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        startButton = findViewById(R.id.start_button);
        nameInput = findViewById(R.id.name_input);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name =  nameInput.getText().toString();
                Intent mainIntent = new Intent(WelcomeActivity.this,MainActivity.class);
                mainIntent.putExtra(Constants.PLAYER_NAME,name);
                WelcomeActivity.this.startActivity(mainIntent);

            }
        });
    }
}