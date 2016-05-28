package com.example.user.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button btn;
    EditText etName;
    TextView tevName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);
        this.setTitle("~~안녕하세요 프로그램~~");

        btn = (Button) findViewById(R.id.btn);
        etName = (EditText) findViewById(R.id.etName);
        tevName = (TextView) findViewById(R.id.tevName);

        btn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                tevName.setText("안녕하세요 :"+etName.getText());
                return false;
            }
        });
    }


}
