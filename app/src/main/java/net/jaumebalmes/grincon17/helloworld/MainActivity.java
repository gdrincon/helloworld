package net.jaumebalmes.grincon17.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button clickButton = findViewById(R.id.clickButton);
        clickButton.setOnClickListener( new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TextView textView = findViewById(R.id.textView);
                if(textView.equals(R.string.text_on_start)) {
                    textView.setText(R.string.text_change);
                } else {
                    textView.setText(R.string.text_on_start);
                }
            }
        });
    }
}
