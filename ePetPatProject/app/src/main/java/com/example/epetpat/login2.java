package com.example.epetpat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login2 extends AppCompatActivity {
    FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        //
        mFirebaseAuth = FirebaseAuth.getInstance();
        final EditText username = findViewById(R.id.username);
        final EditText emailId = findViewById(R.id.email);
        final EditText password = findViewById(R.id.password);
        Button signup1 = findViewById(R.id.signUp1);
        //
        signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailId.getText().toString();
                String pwd = password.getText().toString();
                String user = username.getText().toString();

                if (user.isEmpty()){
                    username.setError("Username is required");
                    username.requestFocus();
                }
                else if (email.isEmpty()){
                    emailId.setError("Email is required");
                    emailId.requestFocus();
                }
                else if (pwd.isEmpty()){
                    password.setError("Password is required");
                    password.requestFocus();
                }
                else if (user.isEmpty() && email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(login2.this,"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                }
                else if (!(user.isEmpty() && email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.createUserWithEmailAndPassword(email,pwd).addOnCompleteListener(login2.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(!task.isSuccessful()){
                                Toast.makeText(login2.this,"SignUp Failed, Please Try Again",Toast.LENGTH_LONG).show();
                            }
                            else{
                                startActivity(new Intent(login2.this,CatInfo1.class));
                            }
                        }
                    });
                }
                else{
                    Toast.makeText(login2.this,"Error Ocurred!",Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}