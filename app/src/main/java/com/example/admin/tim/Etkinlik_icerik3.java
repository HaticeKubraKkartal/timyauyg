package com.example.admin.tim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Etkinlik_icerik3 extends AppCompatActivity implements  View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_etkinlik_icerik3);
        btn=(Button)findViewById(R.id.javaBtn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
