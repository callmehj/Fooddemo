package com.example.fooddemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        final EditText editText1 = (EditText) findViewById(R.id.editText1);
        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editText1.getText().toString();
                String password = editText2.getText().toString();

                if(username.equals("admin")&&password.equals("123456")){
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this,"账号或密码有误",LENGTH_SHORT).show();
                    Log.d("MainActivity",username);
                    Log.d("MainActivity",password);
                }
            }
        });

    }

}
