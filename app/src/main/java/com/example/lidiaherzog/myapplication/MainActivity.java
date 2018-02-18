package com.example.lidiaherzog.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout mlineLearn, mlinePractice, mlineAbout, mlineContact ; //MEMBUAT VARIABLE BERTIPE LINESAR LAYOUT

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //MENYAMBUNGKAN MAINACTIVITY.JAVA DENGAN LAYOUT

        mlineLearn = (LinearLayout) findViewById(R.id.LineLearn);
        mlinePractice = (LinearLayout) findViewById(R.id.LinePractice);
        mlineAbout = (LinearLayout) findViewById(R.id.LineAbout);
        mlineContact = (LinearLayout) findViewById(R.id.LineContact);
        //MENYAMBUNGKAN MAINACTIVIRY.JAVA DENGAN ID PADA LAYOUT

        mlineLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LearnActivity.class);
                startActivity(i);
            }
        });

        mlinePractice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,PracticeActivity.class);
                startActivity(i);
            }
        });
        mlineAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,AboutActivity.class);
                startActivity(i);


            }
        });

        mlineContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String to = "lidiaherzog@ymail.com";
                String subject = "Email";
                String message = "Terakan Email!";

                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String [] {to});
                    email.putExtra(Intent.EXTRA_SUBJECT, subject);
                    email.putExtra(Intent.EXTRA_TEXT,message);
                    email.setType("message/Lidia");
                    startActivity(Intent.createChooser(email, "Kirim email"));



                }

            });//MEMBUAT PESAN EMAIL


    }
@Override
public void onBackPressed(){
    AlertDialog.Builder builder= new AlertDialog.Builder(this );
    builder.setTitle("ANda Yakin Ingin Keluar ?");
    builder.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            finish();
        }
    });
    builder.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    });
    AlertDialog quit = builder.create();
    quit.show();

    }
}