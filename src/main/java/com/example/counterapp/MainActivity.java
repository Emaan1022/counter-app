package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private Button add;
    private Button reset;
    private Button subtract;
    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter=(TextView) findViewById(R.id.counter);
        add=(Button) findViewById(R.id.add);
        add=setOnClickListener(clickListener);
        reset=(Button) findViewById(R.id.reset);
        reset=setOnClickListener(clickListener);
        subtract=(Button) findViewById(R.id.subtract);
        subtract=setOnClickListener(clickListener);

        isitCounter();
    }
private  void isitCounter(){
        count=0;
        counterTxt.setText(count);
}
}