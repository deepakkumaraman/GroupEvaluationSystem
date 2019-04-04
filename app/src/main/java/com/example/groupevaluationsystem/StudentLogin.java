package com.example.groupevaluationsystem;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class StudentLogin extends AppCompatActivity {
    EditText StudentUser, StudentPass;
    Button sLogin, sSignUp;
   // SDBHelper SDB = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login);
        StudentUser = findViewById(R.id.studentUser);
        StudentPass = findViewById(R.id.studentPass);
        sLogin = findViewById(R.id.studentLogin);
        sSignUp = findViewById(R.id.studentSignUp);

//        sLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch(v.getId())
//                {
//
//                    case R.id.studentSignUp:
//                        Intent i = new Intent(getBaseContext(), SignUpPageStudent.class);
//                        startActivity(i);
//                        break;
//
//                    case R.id.studentLogin:
//
//                        StudentUser = findViewById(R.id.studentUser);
//                        StudentPass = findViewById(R.id.studentPass);
//
//                        String email = StudentUser.getText().toString();
//                        String password = StudentPass.getText().toString();
//
//
//
//                        if(email.equals("") || email == null)
//                        {
//                            Toast.makeText(getApplicationContext(), "Please enter User Name", Toast.LENGTH_SHORT).show();
//                        }
//                        else if(password.equals("") || password == null)
//                        {
//                            Toast.makeText(getApplicationContext(), "Please enter your Password", Toast.LENGTH_SHORT).show();
//                        }
//                        else
//                        {
//                            boolean validLogin = validateLogin(email, password, getBaseContext());
//                            if(validLogin)
//                            {
//                                //System.out.println("In Valid");
//                                Intent in = new Intent(getBaseContext(), CreateProject.class);
//                                in.putExtra("email", StudentUser.getText().toString());
//                                startActivity(in);
//                                //finish();
//                            }
//                        }
//                        break;
//
//                }
//
//            }
//
//
//            private boolean validateLogin(String email, String password, Context baseContext)
//            {
////                SDB = new SDBHelper(getBaseContext());
////                SQLiteDatabase sdb = SDB.getReadableDatabase();
//
//                String[] columns = {"_id"};
//
//                String selection = "email=? AND password=?";
//                String[] selectionArgs = {email,password};
//
//                Cursor cursor = null;
//                try{
//
//                    cursor = sdb.query(SDBHelper.DATABASE_TABLE_NAME, columns, selection , selectionArgs, null, null, null);
//                    startManagingCursor(cursor);
//                }
//                catch(Exception e)
//
//                {
//                    e.printStackTrace();
//                }
//                int numberOfRows = cursor.getCount();
//
//                if(numberOfRows <= 0)
//                {
//
//                    Toast.makeText(getApplicationContext(), "User Name and Password miss match..\nPlease Try Again", Toast.LENGTH_LONG).show();
//                    Intent intent = new Intent(getBaseContext(), StudentLogin.class);
//                    startActivity(intent);
//                    return false;
//                }
//
//
//                return true;
//
//            }
//
//            public void onDestroy()
//            {
//                StudentLogin.super.onDestroy();
//                SDB.close();
//            }
//
//        });
        sSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(StudentLogin.this,com.example.groupevaluationsystem.SignUpPageStudent.class);
                startActivity(intent);
            }
        });
    }
}
