package com.example.groupevaluationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpPageFaculty extends AppCompatActivity {
    EditText fName, fDept, fEmail, fPass;
    Button fSubmit, fCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page_faculty);
        fName = findViewById(R.id.fName);
        fDept = findViewById(R.id.fDept);
        fEmail = findViewById(R.id.fEmail);
        fPass = findViewById(R.id.fPass);
        fSubmit = findViewById(R.id.bt6);
        fCancel = findViewById(R.id.facultyCancel);

        fSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        fCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
