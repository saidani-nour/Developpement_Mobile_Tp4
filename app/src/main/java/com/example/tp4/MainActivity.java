package com.example.tp4;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText nom, prenom, mail;
    Button btnsend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nom = findViewById(R.id.nom);
        prenom = findViewById(R.id.prenom);
        mail = findViewById(R.id.mail);
        btnsend = findViewById(R.id.btnsend);
        btnsend.setOnClickListener(v -> {
            String n = nom.getText().toString().trim();
            String p = prenom.getText().toString().trim();
            String m = mail.getText().toString().trim();
            if (n.isEmpty() || p.isEmpty() || m.isEmpty()) {
                Toast.makeText(this, "Veuillez remplir tous les champs",
                        Toast.LENGTH_SHORT).show();
                return;}
            Intent intent = new Intent(MainActivity.this, WelcomeActivity.class);
            intent.putExtra("nom", n);
            intent.putExtra("prenom", p);
            intent.putExtra("mail", m);
            startActivity(intent);
        });
    }
}