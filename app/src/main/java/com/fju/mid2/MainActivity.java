package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private final static int REQUEST_TURN = 88;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void onClick1 (View view){
        Button b1 = (Button) findViewById(R.id.b1);
        Intent intent = new Intent(this, Func1Activity.class);
        startActivityForResult(intent, 1);
    }
    public void onClick2 (View view){
        Button b2 = (Button) findViewById(R.id.b2);
        Intent intent = new Intent(this, Func2Activity.class);
        startActivityForResult(intent, 2);
    }
    public void onClick3 (View view){
        Button b3 = (Button) findViewById(R.id.b3);
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, 3);

    }
    public void onClick4 (View view){
        Button b4 = (Button) findViewById(R.id.b4);
        Intent intent = new Intent(this, Func4Activity.class);
        startActivityForResult(intent, 4);
    }
    public void onClick5 (View view){
        Button b5 = (Button) findViewById(R.id.b5);
        Intent intent = new Intent(this, Func5Activity.class);
        startActivityForResult(intent, 5);
    }
    public void onClick6 (View view){
        Button b6 = (Button) findViewById(R.id.b6);
        Intent intent = new Intent(this, Func6Activity.class);
        startActivityForResult(intent, 6);
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
