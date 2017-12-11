package com.fju.mid2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Func1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
    }
    public void roll(View view) {


        Random r = new Random();
        int i = r.nextInt(5) + 1;
        Button b1 = (Button) findViewById(R.id.b1);
        new AlertDialog.Builder(this)
                .setTitle("結果！")
                .setMessage("數值：" + r)
                .setPositiveButton("ok", null)
                .show();
    }
}
