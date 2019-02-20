package com.example.testapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.Addbtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText first = (EditText) findViewById(R.id.firstNumEditText);
                EditText second = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultView = (TextView) findViewById(R.id.ResulttextView);

                int num1 = Integer.parseInt(first.getText().toString());
                int num2 = Integer.parseInt(second.getText().toString());

                int result = num1 + num2;
                resultView.setText(result + "");

                final Button secondActivity = (Button) findViewById(R.id.changeActivityBtn);
                secondActivity.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent startIntent = new Intent(getApplicationContext(), secondActivity.class);
                        startActivity(startIntent);

                    }
                });

            }
        });
    }
}
