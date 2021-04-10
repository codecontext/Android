package com.example.surfacerecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Chronometer chronometer;
    private TextView recordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = (ToggleButton)findViewById(R.id.tbSwitch);
        chronometer = (Chronometer)findViewById(R.id.cmTimer);
        recordText = (TextView)findViewById(R.id.tvRecording);
    }
}