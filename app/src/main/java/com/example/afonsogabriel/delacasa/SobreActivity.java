package com.example.afonsogabriel.delacasa;

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
                //trocar os dados
                .addGroup("Contato")
                .addEmail("mcdonalds@gmail.com")
                .addWebsite("http://www.mcdonalds.com.br/")
                .addGroup("Redes Socias")
                .addFacebook("McDonaldsBrasil")
                .addTwitter("McDonalds_BR")
                .addInstagram("mcdonalds_br")
                .create();

        setContentView(sobre);
    }
}
