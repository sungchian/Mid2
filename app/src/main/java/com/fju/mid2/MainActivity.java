package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_TURN = 88;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_TURN){
            if (resultCode == RESULT_OK){
                Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void func1 (View view){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
    }
    public void func2 (View view){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
    }
    public void func3 (View view){
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
    }
    public void func4 (View view){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
    }
    public void func5 (View view){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
    }
    public void func6 (View view){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
    }
    public void func7 (View view){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
    }
    public void func8 (View view){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, REQUEST_TURN);
        Toast.makeText(this, "特殊功能", Toast.LENGTH_LONG).show();
    }
}
