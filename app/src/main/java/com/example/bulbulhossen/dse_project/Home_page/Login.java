package com.example.bulbulhossen.dse_project.Home_page;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bulbulhossen.dse_project.Fragment.Main_fragment;
import com.example.bulbulhossen.dse_project.R;

/**
 * Created by Md.Bulbul Hossen on 11/12/15.
 */
public class Login extends AppCompatActivity {

    TextView mainscreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Main Menu


        mainscreen = (TextView) findViewById(R.id.mainlogin_screen);

        mainscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login.this, "Login successful", Toast.LENGTH_SHORT).show();
                Intent mains = new Intent(Login.this,Main_fragment.class);
                startActivity(mains);
            }
        });



        //Login Underline

        TextView textView = new TextView(this);
        textView.setText(R.string.forget);
        String tempString="Froget Password";

        TextView text=(TextView)findViewById(R.id.forgetpassword);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Reset.class);
                startActivity(intent);
            }
        });


        SpannableString spanString = new SpannableString(tempString);
        spanString.setSpan(new UnderlineSpan(), 0, spanString.length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.BOLD), 0, spanString.length(), 0);
        spanString.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanString.length(), 0);
        text.setText(spanString);


        //Signup Underline

        TextView textView_up = new TextView(this);
        textView_up.setText(R.string.forget);
        String tempString_up="Sign Up";


        TextView tex_upt=(TextView)findViewById(R.id.sign);

        tex_upt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Login.this,Signup.class);
                startActivity(intent2);
            }
        });


        SpannableString spanStringup = new SpannableString(tempString_up);
        spanStringup.setSpan(new UnderlineSpan(), 0, spanStringup.length(), 0);
        spanStringup.setSpan(new StyleSpan(Typeface.BOLD), 0, spanStringup.length(), 0);
        spanStringup.setSpan(new StyleSpan(Typeface.ITALIC), 0, spanStringup.length(), 0);
        tex_upt.setText(spanStringup);








    }
}
