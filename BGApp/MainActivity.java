package com.example.bgapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.widget.Button;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
        bgElement.setBackgroundColor((Color.RED));
        colorButtonListenerMethod();
    }

    public void colorButtonListenerMethod(){
        final Button colorButton = (Button) findViewById(R.id.colorButton);
        colorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                ConstraintLayout bgElement = (ConstraintLayout) findViewById(R.id.activity_main);
                int corFundo = ((ColorDrawable) bgElement.getBackground()).getColor();
                if (corFundo == Color.RED) {
                    bgElement.setBackgroundColor(Color.BLUE);
                    colorButton.setTextColor(Color.RED);
                    colorButton.setText("Azul");
                } else {
                    bgElement.setBackgroundColor(Color.RED);
                    colorButton.setText("Vermelho");
                    colorButton.setTextColor(Color.BLUE);
                }
            }
        });
    }

}
