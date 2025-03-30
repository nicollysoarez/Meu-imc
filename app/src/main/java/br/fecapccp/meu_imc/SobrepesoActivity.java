package br.fecapccp.meu_imc;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SobrepesoActivity extends AppCompatActivity {

    private TextView txtDados, txtMensagem;
    private ImageView imgResultado;
    private Button btnFechar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobrepeso);

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
                "Classificação: Sobrepeso";


        txtDados.setText(resultado);
        txtMensagem.setText(getString(R.string.mensagem_sobrepeso));
        imgResultado.setImageResource(R.drawable.sobrepeso);

        btnFechar.setOnClickListener(v -> finish());
    }
}
