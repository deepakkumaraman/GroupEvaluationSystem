package com.example.groupevaluationsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    Button Faculty, Student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firstpage);
        Faculty = findViewById(R.id.faculty);
        Student = findViewById(R.id.student);
        Faculty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,com.example.groupevaluationsystem.FacultyLogin.class);
                startActivity(intent);

            }
        });
        Student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstPage.this,com.example.groupevaluationsystem.StudentLogin.class);
                startActivity(intent);

            }
        });

    }
}
