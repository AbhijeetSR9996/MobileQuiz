package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class Main19Activity extends AppCompatActivity {
Button button1,reset;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main19 );
        button1=findViewById( R.id.submitq11 );
        radioButton1=findViewById( R.id.radioButton1 );
        radioButton2=findViewById( R.id.radioButton2 );
        radioButton3=findViewById( R.id.radioButton3 );
        radioButton4=findViewById( R.id.radioButton4 );


        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (radioButton1.isChecked()||radioButton2.isChecked()||radioButton3.isChecked()||radioButton4.isChecked()) {

                    Intent intent = new Intent( Main19Activity.this, Main20Activity.class );
                    startActivity( intent );

                }
                else
                    Toast.makeText( Main19Activity.this, "Please answer to continue ", Toast.LENGTH_SHORT ).show();
                return;

            }
        } );
        reset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
            }
        } );
    }
}
