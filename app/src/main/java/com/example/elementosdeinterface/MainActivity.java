package com.example.elementosdeinterface;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.elementosdeiterface.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        CheckBox ckbTv = findViewById(R.id.ckb_tv);/*OBS:No java ao nomear as variaveis sempre
        utlizamos o camel case começar com letra minuscula na primeira variavel e a proxima palavra
        da variavel começa com letra maiúscula.O metodo findViewById busca o id lá no xml
         dae podemos buscar no (R.id.agora vai aparecer nossos ids só escolher nesse caSo
         o ckb_tv)*/
        CheckBox ckbGeladeira = findViewById(R.id.ckb_geladeira);
        CheckBox ckbMicroondas = findViewById(R.id.ckb_microondas);/*OBS tomar cuidado para não
        confundir o id do Constraint Main com o id dos nossos objetos.*/
        EditText edtNome = findViewById(R.id.edt_nome);

        Button btnOk = findViewById(R.id.btn_OK);
/*OBS ESTA PARTE DO CÓDIGO FOI SUBSTITUIDA PARA NÃO FICAR O BOOLEAN EX: A TV
* ESTÁ TRUE COM ESSA MODIFICAÇÃO FICA A Tv está desligada
* ESSA PARTE DO CÓDIGO FOI ENSINADA ASSIM :
* btnOk.setOnClickListener(v -> {
            //ckbTv.isChecked();
            String strNome = edtNome.getText().toString();
Toast.makeText(MainActivity.this, "A tv está " + ckbTv.isChecked(), Toast.LENGTH_LONG).show();
Toast.makeText(MainActivity.this, "A geladeira está " + ckbGeladeira.isChecked(), Toast.LENGTH_LONG).show();
Toast.makeText(MainActivity.this, "O microondas está " + ckbMicroondas.isChecked(), Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, strNome, Toast.LENGTH_LONG).show();*/
        btnOk.setOnClickListener(v -> {
            String strNome = edtNome.getText().toString();

            // Verificando o estado dos CheckBoxes e exibindo "Ligado" ou "Desligado"
            String estadoTv = ckbTv.isChecked() ? "Ligado" : "Desligado";
            String estadoGeladeira = ckbGeladeira.isChecked() ? "Ligada" : "Desligada";
            String estadoMicroondas = ckbMicroondas.isChecked() ? "Ligado" : "Desligado";

            // Exibindo as mensagens
            Toast.makeText(MainActivity.this, "A TV está " + estadoTv, Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, "A geladeira está " + estadoGeladeira, Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, "O microondas está " + estadoMicroondas, Toast.LENGTH_LONG).show();
            Toast.makeText(MainActivity.this, strNome, Toast.LENGTH_LONG).show();
        });



    }
}