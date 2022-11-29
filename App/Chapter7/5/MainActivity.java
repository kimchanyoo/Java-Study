package com.example.testexam7_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView toastImg;
    View toastView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 7-5");

        btn = (Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(MainActivity.this);
                toastView = (View) View.inflate(MainActivity.this,
                        R.layout.toast1, null);
                toastImg = (ImageView) toastView.findViewById(R.id.imgView1);
                toastImg.setImageResource(R.drawable.android12);
                toast.setView(toastView);
                Display display = ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
                int xoffset = (int)(Math.random()*display.getWidth());
                int yoffset = (int)(Math.random()*display.getHeight());
                toast.setGravity(Gravity.TOP | Gravity.LEFT,xoffset,yoffset);
                toast.show();
            }
        });
    }
}