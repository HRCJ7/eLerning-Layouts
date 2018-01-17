package com.example.rajithaperera.androidlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView linear_layout,relative_layout,frame_layout,table_layout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linear_layout=(TextView)findViewById(R.id.linear_layout);
        relative_layout=(TextView)findViewById(R.id.relative_layout);
        frame_layout=(TextView)findViewById(R.id.frame_layout);
        table_layout=(TextView)findViewById(R.id.table_layout);

        linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        relative_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });
        frame_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FrameLayoutActivity.class);
                startActivity(intent);
            }
        });
        table_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }
}
