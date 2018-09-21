package me.thanongsine.androiddemotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class RadioGroupActivity extends AppCompatActivity {
    RadioButton radioBtn1;
    RadioButton radioBtn2;
    RadioButton radioBtn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_group);

        String msg = getIntent().getStringExtra("myMsg");
        Log.e("IntentMsgLog", "MyMsg = " + msg);

        radioBtn1 = findViewById(R.id.radio1);
        radioBtn2 = findViewById(R.id.radio2);
        radioBtn3 = findViewById(R.id.radio3);

        radioBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You have clicked Radio 1",
                        Toast.LENGTH_SHORT).show();
            }
        });

        radioBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You have clicked Radio 2",
                        Toast.LENGTH_SHORT).show();
            }
        });

        radioBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You have clicked Radio 3",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
