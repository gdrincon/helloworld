package net.jaumebalmes.grincon17.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button clickButton;
    TextView textView;
    boolean cat = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickButton = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);
        clickButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(!cat) {
                    textView.setText(R.string.text_change);
                    clickButton.setText(R.string.button_cat_text);
                    clickButton.setBackgroundColor(Color.rgb(21,113,37));
                    cat = true;
                } else {
                    textView.setText(R.string.text_on_start);
                    clickButton.setText(R.string.button_en_text);
                    clickButton.setBackgroundColor(Color.rgb(40,116,166));
                    cat = false;
                }


            }
        });

    }
}
