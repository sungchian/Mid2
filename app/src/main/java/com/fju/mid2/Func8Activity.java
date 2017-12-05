package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Func8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func8);
    }
    public void func0 (View view){
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
