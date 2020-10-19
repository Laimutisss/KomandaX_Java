package com.example.komandax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);
        final EditText mail = findViewById(R.id.mail);

        Button register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // čia bus vykdomas kodas, kai paspaudžiamas mygtukas
                /*Toast.makeText(RegisterActivity.this,
                        username.getText().toString(),
                        mail.getText().toString(),
                        password.getText().toString(),
                        Toast.LENGTH_SHORT).show();*/

                username.setError(null);
                if(Validation.isValidUsername(username.getText().toString())) {
                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else { // jeigu username neteisingas
                    username.setError("Error! Wrong username");
                    username.requestFocus();
                }

                mail.setError(null);
                if(Validation.isValidMail(mail.getText().toString())) {
                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else { // jeigu password neteisingas
                    mail.setError("Error! Wrong E.Mail");
                    mail.requestFocus();
                }

                password.setError(null);
                if(Validation.isValidPassword(password.getText().toString())) {
                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                } else { // jeigu password neteisingas
                    password.setError("Error! Wrong password");
                    password.requestFocus();
                }

            }
        });
    }
}