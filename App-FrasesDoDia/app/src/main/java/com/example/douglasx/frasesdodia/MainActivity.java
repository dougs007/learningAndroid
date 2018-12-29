package com.example.douglasx.frasesdodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adicionar a frase na caixa de texto.
     *
     */
    public void adicionarFrase(View view)
    {
        // Array de Frases.
        String[] Arrayfrases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o resto do seu dia",
                "Que o dia seja leve, que a tristeza seja breve e que o dia seja incrível!",
                "Que o dia comece bem e termine ainda melhor",
                "Para hoje: sorrisos bobos, uma mente tranquila e um coração cheio de alegria",
                "Sempre que o sol nasce, você uma nova oportunidade de ser uma pessoa melhor que ontem",
        };

        // Número randômico, de acordo com o valor do Array.
        int num = new Random().nextInt(Arrayfrases.length);
        TextView texto = findViewById(R.id.fraseEscolhida);

        texto.setText( Arrayfrases[num] );
    }
}
