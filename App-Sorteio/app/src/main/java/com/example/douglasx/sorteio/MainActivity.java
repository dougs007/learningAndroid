package com.example.douglasx.sorteio;

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

    public void sortearNumeroClick(View view)
    {
        TextView textoSorteado = findViewById(R.id.numeroSelecionado);

        int random = new Random().nextInt(11);
        textoSorteado.setText("O número selecionado é -> "+random);
    }
}
