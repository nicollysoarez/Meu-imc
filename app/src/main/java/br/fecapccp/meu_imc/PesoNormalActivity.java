package br.fecapccp.meu_imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import br.fecapccp.meu_imc.R;

public class PesoNormalActivity extends AppCompatActivity {

    private TextView txtDados, txtMensagem;
    private ImageView imgResultado;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso_normal);

        txtDados = findViewById(R.id.txtDados);
        txtMensagem = findViewById(R.id.txtMensagem);
        imgResultado = findViewById(R.id.imgResultado);
        btnFechar = findViewById(R.id.btnFechar);

        Intent intent = getIntent();
        double peso = intent.getDoubleExtra("peso", 0);
        double altura = intent.getDoubleExtra("altura", 0);
        double imc = intent.getDoubleExtra("imc", 0);

        String resultado = "Peso: " + String.format("%.1f", peso) + " kg\n" +
                "Altura: " + String.format("%.2f", altura) + " m\n" +
                "IMC: " + String.format("%.2f", imc) + "\n" +
                "Classificação: Peso normal";


        txtDados.setText(resultado);
        txtMensagem.setText(getString(R.string.mensagem_peso_normal));
        imgResultado.setImageResource(R.drawable.pesonormal);

        btnFechar.setOnClickListener(v -> finish());
    }
}
