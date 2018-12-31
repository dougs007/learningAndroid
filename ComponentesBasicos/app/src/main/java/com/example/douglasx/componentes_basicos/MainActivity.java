package com.example.douglasx.componentes_basicos;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText campoProduto;
    private TextView resultado;
    private CheckBox cbBranco, cbVerde, cbVermelho;
    List<String> check = new ArrayList<String>();
    private RadioGroup rgEstoque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referências para os componentes da interface.
        campoProduto = findViewById(R.id.eTNomeProduto);
        resultado = findViewById(R.id.txtVResultado);
        cbBranco = findViewById(R.id.cbBranco);
        cbVerde = findViewById(R.id.cbVerde);
        cbVermelho = findViewById(R.id.cbVermelho);
        rgEstoque = findViewById(R.id.rgEstoque);
    }

    /**
     *
     */
    public void verificaRadioButton()
    {

    }
    /**
     * Verifica qual checkbox foi preenchido.
     */
    public void verificaCheck()
    {
        check.clear(); // Limpa a lista e mostra somente os checked atuais.
        if( cbBranco.isChecked() ){
            check.add(cbBranco.getText().toString());
        }
        if( cbVerde.isChecked() ){
            check.add(cbVerde.getText().toString());
        }
        if( cbVermelho.isChecked() ){
            check.add(cbVermelho.getText().toString());
        }
        resultado.setText(check.toString());
    }

    /**
     * Evento de clique para submeter dados inseridos no formulário.
     *
     * @param View
     */
    public void btnEnviar(View View)
    {
        /*// Armazena em tx_produto o que foi inserido no formulário no campo de "Nome do Produto".
        String tx_produto = campoProduto.getText().toString();

        // Exibe o valor inserido no formulário on campo de resultado.
        resultado.setText( tx_produto );*/

//        verificaCheck();
        verificaRadioButton();
    }
}
