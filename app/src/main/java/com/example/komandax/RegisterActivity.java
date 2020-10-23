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
            public void onClick(View focusView) {

                boolean cancel = false;
                focusView = null;

                if(Validation.isValidUsername(username.getText().toString())) {
                    username.setError(getString(R.string.login_invalid_username));
                    cancel = true;
                }

                if (Validation.isValidMail(mail.getText().toString())) {
                    mail.setError(getString(R.string.login_invalid_mail));
                    cancel = true;
                }

                if(Validation.isValidUsername(username.getText().toString())) {
                    password.setError(getString(R.string.login_invalid_password));
                    cancel = true;
                }

                if (cancel) {
                    focusView.requestFocus();
                } else {
                    Toast.makeText(RegisterActivity.this, username.getText().toString() + "\n" + mail.getText().toString() + "\n" + password.getText().toString(),
                            Toast.LENGTH_SHORT).show();

                    Intent goToLoginActivity = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(goToLoginActivity);
                }

            }
        });
    }
}