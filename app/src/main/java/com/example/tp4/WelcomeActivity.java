package com.example.tp4;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeActivity extends AppCompatActivity {

    TextView txtWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        txtWelcome = findViewById(R.id.txtWelcome);

        String nom = getIntent().getStringExtra("nom");
        String prenom = getIntent().getStringExtra("prenom");
        String mail = getIntent().getStringExtra("mail");

        String message = "Bienvenue " + prenom + " " + nom+"\n C'est la deuxième activité. Vous serez bientôt contacté sur votre email : " + mail;

        txtWelcome.setText(message);
    }
}