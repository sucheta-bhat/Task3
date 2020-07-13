package com.example.a3rdtask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1,b2;
    int counter=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ed1);
        ed2=findViewById(R.id.ed2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1.getText().toString().equals("admin")&& ed2.getText().toString().equals("12345"))
                {
                    Toast.makeText(MainActivity.this,"successful....",Toast.LENGTH_LONG).show();
                }
                else
                    {
                        Toast.makeText(MainActivity.this,"wrong credentials",Toast.LENGTH_LONG).show();
                        counter--;
                        if(counter==0){
                            b1.setEnabled(false);
                            new CountDownTimer(5000, 10) { //Set Timer for 5 seconds
                                public void onTick(long millisUntilFinished) {
                                }

                                @Override
                                public void onFinish() {
                                    b1.setEnabled(true);
                                }
                            }.start();
                        }
                    }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
