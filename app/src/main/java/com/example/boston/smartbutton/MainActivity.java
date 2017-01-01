package com.example.boston.smartbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button
        Button kiranbutton = (Button)findViewById(R.id.kiranbutton);
        //Button Event, onclick listner
        kiranbutton.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        TextView kirantext = (TextView) findViewById(R.id.kirantext);
                        kirantext.setText("Super Click ");
                    }
                }
        );


    }
}
