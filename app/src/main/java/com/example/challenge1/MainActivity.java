package com.example.challenge1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOnclick (View view){
        TextView txtFirst = findViewById(R.id.textView2);
        TextView txtLast = findViewById(R.id.textView);
        TextView txtEmail = findViewById(R.id.textView3);
        EditText editFirst = findViewById(R.id.editTextTextPersonName);
        EditText editLast = findViewById(R.id.editTextTextPersonName2);
        EditText editEmail = findViewById(R.id.editTextTextEmailAddress);
        txtFirst.setText("First Name "+ editFirst.getText().toString());
        txtLast.setText("Last Name "+ editLast.getText().toString());
        txtEmail.setText("email is " + editEmail.getText().toString());
    }
}