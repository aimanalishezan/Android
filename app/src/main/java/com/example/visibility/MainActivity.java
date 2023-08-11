package com.example.visibility;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button signin,signup,back,next;
    LinearLayout page2;
    ImageView image;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signin=findViewById(R.id.signin);
        signup=findViewById(R.id.signup);
        page2=findViewById(R.id.page2);
        back=findViewById(R.id.back);
        page2.setVisibility(View.GONE);
        image=findViewById(R.id.image);
        next=findViewById(R.id.next);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    page2.setVisibility(View.VISIBLE);
                    image.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this,"Log In\nScroll Down",Toast.LENGTH_LONG).show();
            }

        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                page2.setVisibility(View.GONE);
                image.setVisibility(View.GONE);
            }

        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mayintent=new  Intent(MainActivity.this,page2.class);
                startActivity(mayintent);
            }
        });
    }
}