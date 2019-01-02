package com.example.douglasx.alcoolougasolina;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText txtPrecoAlcool;
    private EditText txtPrecoGas;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtPrecoAlcool = findViewById(R.id.txtPrecoAlcool);
        txtPrecoGas = findViewById(R.id.txtPrecoGas);
        txtResultado = findViewById(R.id.txtResultado);
    }

    public void calcularPreco(View view) {

        // recuperar os valores digitados.
        String alcool = txtPrecoAlcool.getText().toString();
        String gasolina = txtPrecoGas.getText().toString();

        // Validar os campos inseridos no fomulário
        Boolean camposValidados = this.validarCampos(alcool, gasolina);

        if (camposValidados) {
            this.calcularMelhorPrecos(alcool, gasolina);
        } else {
            txtResultado.setText("Preencha os preços primeiro !");
        }
    }

    public void calcularMelhorPrecos(String pAlcool, String pGas) {

        Double alcool = Double.parseDouble(pAlcool);
        Double gas = Double.parseDouble(pGas);

        /* Faz Cálculo (pAlcoll / pGas)
         * Se resultado => 0.7 melhor utilizar gasolina
         * senão melhor utilizar alcool.
         **/
        Double resultado = alcool / gas;

        if (resultado >= 0.7) {
            txtResultado.setText("Melhor utilizar a Gasolina");
            System.out.println("Melhor utilizar a Gasolina");
        } else {
            txtResultado.setText("Melhor utilizar o Álcoll!");
            System.out.println("Melhor utilizar o Álcoll!");
        }
    }

    public boolean validarCampos(String pAlcool, String pGas) {

        Boolean camposValidados = true;

        // validar campos.
        if (pAlcool == null || pAlcool.equals("")) {
            camposValidados = false;
        } else if (pGas == null || pGas.equals("")) {
            camposValidados = false;
        }

        return camposValidados;
    }
}
