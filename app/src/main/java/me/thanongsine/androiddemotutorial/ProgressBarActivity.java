package me.thanongsine.androiddemotutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button showProgressBtn;
    Button hideProgressBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);

        //Blinding views with Java variable
        progressBar = findViewById(R.id.progressbar);
        showProgressBtn = findViewById(R.id.show_progress_btn);
        hideProgressBtn = findViewById(R.id.hide_progress_btn);

        //By default hide progressbar
        progressBar.setVisibility(View.GONE);

        //When showProgressBtn was click show progressbar
        showProgressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
            }
        });

        //When hideProgressBtn was click hide progressbar
        hideProgressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.GONE);
            }
        });

    }
}
