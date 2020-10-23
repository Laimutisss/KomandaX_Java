package com.example.komandax;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText username = findViewById(R.id.username);
        final EditText password = findViewById(R.id.password);

        Button login = findViewById(R.id.login);
        Button register = findViewById(R.id.register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // čia bus vykdomas kodas, kai paspaudžiamas mygtukas
                Toast.makeText(LoginActivity.this, username.getText().toString() + "\n" + password.getText().toString(),
                        Toast.LENGTH_SHORT).show();

                username.setError(null);
                if(Validation.isValidUsername(username.getText().toString())) {
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                } else { // jeigu username neteisingas
                    username.setError(getString(R.string.login_invalid_username));
                    username.requestFocus();
                }

                password.setError(null);
                if(Validation.isValidPassword(password.getText().toString())) {
                    Intent goToSearchActivity = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(goToSearchActivity);
                } else { // jeigu password neteisingas
                    password.setError(getString(R.string.login_invalid_password));
                    password.requestFocus();
                }


            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // čia bus vykdomas kodas, kai paspaudžiamas mygtukas
                Intent goToRegisterActivity = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(goToRegisterActivity);
            }
        });


    }

}