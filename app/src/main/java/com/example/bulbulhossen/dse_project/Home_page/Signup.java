package com.example.bulbulhossen.dse_project.Home_page;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bulbulhossen.dse_project.R;

/**
 * Created by Md.Bulbul Hossen on 11/12/15.
 */
public class Signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        TextView textlogin = (TextView) findViewById(R.id.login_signup);
        TextView signn = (TextView) findViewById(R.id.signupp);
        signn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Signup.this, "Sign Up successful. Please check your email for confirmation..", Toast.LENGTH_SHORT).show();

                Intent iii = new Intent(Signup.this,Home.class);
                startActivity(iii);
            }
        });
        
        textlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(Signup.this,Login.class);
                startActivity(in);
            }
        });
        
        
        
    }
}
