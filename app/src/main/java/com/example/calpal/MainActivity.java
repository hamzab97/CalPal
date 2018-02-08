package com.example.calpal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.ibm.watson.developer_cloud.visual_recognition.v3.VisualRecognition;

import org.w3c.dom.Text;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView textView = (TextView)findViewById(R.id.textbox);
        Recognizer recognizer;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VisualRecognition service = new VisualRecognition(VisualRecognition.VERSION_DATE_2016_05_20);
        service.setApiKey("0192827853fc278bc791c9a50a4c90b2893fa1d6");
        try {
            recognizer = new Recognizer(service);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void onClick(TextView textView){
        Button button = (Button)findViewById(R.id.activationButton);
        textView.setText("Button tapped");
    }
}
