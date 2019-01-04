package com.example.douglasx.app_atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.douglasx.app_atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sobre);

        String dsc = "A ATM Consultoria tem como missão apoiar as organizações que desejam alcançar a o sucesso através da excelência em gestão e da busca pela qualidade. \n\n"+
                "Nosso trabalho é dar suporte às empresas que desejam se certificar em padrões de qualidade ou investir no desenvolvimento e evolução de sua gestão, por meio da otimização dos processos e da disseminação dos Fundamentos e Critérios de Excelência.";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription( dsc )
                .addGroup("Fale Conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie-me um e-mail")
                .addWebsite("http://google.com.br/","Acesse nosso site")
                .addGroup("Acesse nossas Redes Sociais")
                .addFacebook("google", "Facebook")
                .addTwitter("google", "Twitter")
                .addYoutube("google", "Youtube")
                .addPlayStore("google", "PlayStore")
                .addGitHub("google","Github")
                .addInstagram("google","Instagram")
                .create();

        setContentView( sobre );


    }
}
