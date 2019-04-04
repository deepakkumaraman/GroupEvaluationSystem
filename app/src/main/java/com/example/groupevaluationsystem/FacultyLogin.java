package com.example.groupevaluationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FacultyLogin extends AppCompatActivity {
    EditText FacultyUser, FacultyPass;
    Button fLogin, fSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_login);
        FacultyUser = findViewById(R.id.facultyUser);
        FacultyPass = findViewById(R.id.facultyPass);
        fLogin = findViewById(R.id.facultyLogin);
        fSignUp = findViewById(R.id.bt6);

        fLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FacultyLogin.this,com.example.groupevaluationsystem.SignUpPageFaculty.class);
                startActivity(intent);

            }
        });
    }
}
