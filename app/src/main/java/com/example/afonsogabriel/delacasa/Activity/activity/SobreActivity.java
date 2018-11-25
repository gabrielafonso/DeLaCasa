package com.example.afonsogabriel.delacasa.Activity.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sobre);


        View sobre = new AboutPage(this)

               // .setImage(R.mipmap.ic_logo_vermelho)
                .addGroup("Contato")
                .addEmail("delacasa@gmail.com")
                .create();

        setContentView(sobre);
    }
}
