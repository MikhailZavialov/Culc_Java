package com.example.calculator1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1 = findViewById(R.id.button1);
    EditText editText1 = findViewById(R.id.editText);
    EditText editText2 = findViewById(R.id.editText2);
    TextView textView = findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                double x = Double.valueOf(editText1.getText().toString());
                double y = Double.valueOf(editText2.getText().toString());

                textView.setText(String.valueOf("aaa")); /* daaaaaaa*/
            }
        });
    }

}

