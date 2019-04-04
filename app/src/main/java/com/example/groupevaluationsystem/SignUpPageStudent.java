package com.example.groupevaluationsystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import static com.example.groupevaluationsystem.R.id.bt6;
import static com.example.groupevaluationsystem.R.id.studentCancel;

public class SignUpPageStudent extends AppCompatActivity  {
    EditText sName, sRoll, sBranch, sMob, sEmail, sPass;
    Button sSubmit, sCancel;
    private Spinner sGender;
    private String Gen;
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page_student);
        sName = findViewById(R.id.sName);
        sRoll = findViewById(R.id.sRoll);
        sBranch = findViewById(R.id.sBranch);
        sMob = findViewById(R.id.sMob);
        sEmail = findViewById(R.id.sEmail);
        sPass = findViewById(R.id.sPass);
        sSubmit = findViewById(bt6);
        sCancel = findViewById(studentCancel);
        sGender = findViewById(R.id.spinner1);
        // Spinner method to read the on selected value
//        ArrayAdapter<State> spinnerArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, new State[]
//                {
//                        new State("Male"), new State("Female")});
//        sGender.setAdapter(spinnerArrayAdapter);
//        sGender.setOnItemSelectedListener(this);

        sSubmit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case studentCancel:
                        Intent i = new Intent(getBaseContext(), StudentLogin.class);
                        startActivity(i);
                        //finish();
                        break;

                    case bt6:


                        String name = sName.getText().toString();
                        String roll = sRoll.getText().toString();
                        String branch = sBranch.getText().toString();
                        String mob = sMob.getText().toString();
                        String email = sEmail.getText().toString();
                        String pass = sPass.getText().toString();

                        boolean invalid = false;

                        if (name.equals("")) {
                            invalid = true;
                            Toast.makeText(getApplicationContext(), "Enter your Name", Toast.LENGTH_SHORT).show();
                        }    else if (roll.equals("")) {
                                invalid = true;
                                Toast.makeText(getApplicationContext(), "Please enter your Roll number", Toast.LENGTH_SHORT).show();
                        } else if (branch.equals("")) {
                            invalid = true;
                            Toast.makeText(getApplicationContext(), "Please enter your Branch", Toast.LENGTH_SHORT).show();
                        } else if (mob.equals("")) {
                            invalid = true;
                            Toast.makeText(getApplicationContext(), "Please enter your Mobile number", Toast.LENGTH_SHORT).show();
                        } else if (email.equals("")) {
                            invalid = true;
                            Toast.makeText(getApplicationContext(), "Please enter your Email ID", Toast.LENGTH_SHORT).show();
                        } else if (pass.equals("")) {
                            invalid = true;
                            Toast.makeText(getApplicationContext(), "Please enter your Password", Toast.LENGTH_SHORT).show();


                        } else if (invalid == false) {
                          //  addEntry(name, roll, branch, Gen, mob, email, pass);
                            Intent i_register = new Intent(SignUpPageStudent.this, StudentLogin.class);
                            startActivity(i_register);
                            //finish();
                        }

                        break;
                }
            }

        });

        sCancel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
//    private void addEntry(String name, String roll, String branch, String gen, String mob, String email, String pass) {
//
//
//        SQLiteDatabase db = SDB.getWritableDatabase();
//
//        ContentValues values = new ContentValues();
//        values.put("name", name);
//        values.put("roll", roll);
//        values.put("branch", branch);
//        values.put("gender", gen);
//        values.put("mobile", mob);
//        values.put("email", email);
//        values.put("password", pass);
//
//        try
//        {
//            db.insert(SDBHelper.DATABASE_TABLE_NAME, null, values);
//
//            Toast.makeText(getApplicationContext(), "your details submitted Successfully...", Toast.LENGTH_SHORT).show();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//
//    }
//    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
//    {
//        // Get the currently selected State object from the spinner
//        State st = (State)sGender.getSelectedItem();
//
//        // Show it via a toast
//        toastState( "onItemSelected", st );
//    }
//
//
//    public void toastState(String name, State st)
//    {
//        if ( st != null )
//        {
//            Gen = st.name;
//            //Toast.makeText(getBaseContext(), Gen, Toast.LENGTH_SHORT).show();
//
//        }
//
//    }
//
//
//    public void onNothingSelected(AdapterView<?> arg0) {
//        // TODO Auto-generated method stub
//
//    }
//


}
