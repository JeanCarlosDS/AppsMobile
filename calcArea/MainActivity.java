package com.example.pmii40;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pmii40.R;

import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoCalculaAreaListener();
}

    public void botaoCalculaAreaListener() {
        Button botaoCalculaArea = (Button) findViewById(R.id.botaoCalculaArea);
        botaoCalculaArea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final EditText inputAltura = (EditText) findViewById(R.id.inputAltura);
                double alturaDecimal = Double.parseDouble(inputAltura.getText().toString());
                final EditText inputLargura = (EditText) findViewById(R.id.inputLargura);
                double larguraDecimal = Double.parseDouble(inputLargura.getText().toString());
                DecimalFormat df = new DecimalFormat("#.#");

                double areaDecimal = Double.parseDouble(df.format(alturaDecimal * larguraDecimal));
                final EditText outputArea = (EditText) findViewById(R.id.outputArea);
                outputArea.setText(Double.toString(areaDecimal));
            }
        });
    }

}
