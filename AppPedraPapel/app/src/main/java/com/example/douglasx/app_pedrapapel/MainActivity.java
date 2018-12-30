package com.example.douglasx.app_pedrapapel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Indica que o usuário selecionou Pedra.
     * @param view
     */
    public void selecionarPedra(View view)
    {
        this.opcaoSelecionada("pedra");
    }

    /**
     * Indica que o usuário selecionou Papel.
     * @param view
     */
    public void selecionarPapel(View view)
    {
        this.opcaoSelecionada("papel");
    }

    /**
     * Indica que o usuário selecionou Tesoura.
     * @param view
     */
    public void selecionarTesoura(View view)
    {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String chooseUser)
    {
        // Cria uma var para setar a imagem da escolha do app.
        ImageView imgResult = findViewById(R.id.imageResultado);
        TextView textoResult = findViewById(R.id.textResultado);

        // Opções de Seleção ao usuário.
        String[] options = {"pedra", "papel", "tesoura"};

        // Gera um randômico de acordo com o tamanho do array
        int num = new Random().nextInt(options.length);

        // A escolha do App de acordo com o random gerado.
        String appChoose = options[num];

        switch ( appChoose){
            case "pedra":
                imgResult.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgResult.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgResult.setImageResource(R.drawable.tesoura);
                break;
        }

        if(
                (appChoose == "pedra"   && chooseUser == "tesoura") ||
                (appChoose == "papel"   && chooseUser == "pedra") ||
                (appChoose == "tesoura" && chooseUser == "papel")
                ){ // app wins

            textoResult.setText("Você perdeu :( !!");

        }else if(
                (chooseUser == "pedra"   && appChoose == "tesoura") ||
                (chooseUser == "papel"   && appChoose == "pedra") ||
                (chooseUser == "tesoura" && appChoose == "papel")
                ){ // user wins
            textoResult.setText("Você ganhou :) !!");

        }else{ // draw
            textoResult.setText("Jogo empatado :$ !!");
        }
    }
}
