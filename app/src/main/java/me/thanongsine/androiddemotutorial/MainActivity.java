package me.thanongsine.androiddemotutorial;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button progressBarBtn;
    Button radioGroupBtn;
    Button imageViewBtn;
    Button alertDialogBtn;
    Button optionsMenuBtn;
    Button lifecycleBtn;

    String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarBtn = findViewById(R.id.btn_progressbar);
        radioGroupBtn = findViewById(R.id.btn_radio_group);
        imageViewBtn = findViewById(R.id.btn_image_view);
        alertDialogBtn = findViewById(R.id.btn_alertDialog);
        optionsMenuBtn = findViewById(R.id.btn_options_menu);
        lifecycleBtn = findViewById(R.id.btn_lifecycle);

        progressBarBtn.setOnClickListener(this);
        radioGroupBtn.setOnClickListener(this);
        imageViewBtn.setOnClickListener(this);
        alertDialogBtn.setOnClickListener(this);
        optionsMenuBtn.setOnClickListener(this);
        lifecycleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_progressbar:
                msg = "Hello Progressbar Activity";
                Intent intent = new Intent(MainActivity.this, ProgressBarActivity.class);
                intent.putExtra("myMsg", msg);
                startActivity(intent);
                break;
            case R.id.btn_radio_group:
                msg = "Hello RadioGroup Activity";
                Intent intent1 = new Intent(MainActivity.this, RadioGroupActivity.class);
                intent1.putExtra("myMsg", msg);
                startActivity(intent1);
                break;
            case R.id.btn_image_view:
                msg = "Hello ImageView Activity";
                Intent intent2 = new Intent(MainActivity.this, ImageViewActivity.class);
                intent2.putExtra("myMsg", msg);
                startActivity(intent2);
                break;
            case R.id.btn_alertDialog:
                msg = "Hello AlertDialog Activity";
                Intent intent3 = new Intent(MainActivity.this, AlertDialogActivity.class);
                intent3.putExtra("myMsg", msg);
                startActivity(intent3);
                break;
            case R.id.btn_options_menu:
                msg = "Hello Options Menu Activity";
                Intent intent4 = new Intent(MainActivity.this, OptionsMenuActivity.class);
                intent4.putExtra("myMsg", msg);
                startActivity(intent4);
                break;
            case  R.id.btn_lifecycle:
                msg = "Hello Lifecycle Activity";
                Intent intent5 = new Intent(MainActivity.this, ActivityLifeCycleActivity.class);
                intent5.putExtra("myMsg", msg);
                startActivity(intent5);
                break;
        }
    }
}
