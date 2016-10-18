package edu.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edtPassword, edtUsername;
    Button btnLogin, btnSignup;
    String user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //making reference to view

        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnSignup = (Button) findViewById(R.id.btnSignup);

        //Login Button Click Listner
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //get the values after onClick....
                user = edtPassword.getText().toString();
                pass = edtUsername.getText().toString();
                if (user.equals(pass) && !user.equals("") && !pass.equals("")) {
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    i.putExtra("username",user);
                    i.putExtra("password",pass);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this, "Sorry..Try Again", Toast.LENGTH_SHORT).show();
                }
            }

        });

        //Sign Up Button Click Listner
        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Sign Up Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

