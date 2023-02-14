package br.edu.ifsp.scl.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Formulario form;
    private Button limparBt;
    private Button salvarBt;
    private EditText nomeEt;
    private EditText telefoneEt;
    private EditText emailEt;
    private CheckBox listaEmailCb;
    private RadioButton masculinoRb;
    private RadioButton femininoRb;
    private EditText cidade;
    private Spinner uf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeEt = findViewById(R.id.nomeEt);
        telefoneEt = findViewById(R.id.telefoneEt);
        emailEt = findViewById(R.id.emailEt);
        listaEmailCb = findViewById(R.id.listaEmailCb);
        masculinoRb = findViewById(R.id.masculinoRb);
        femininoRb = findViewById(R.id.femininoRb);
        cidade = findViewById(R.id.cidadeEt);
        uf = findViewById(R.id.ufSp);

        form = new Formulario();
        salvarBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                form = new Formulario();
                form.setNomeCompleto(nomeEt.getText().toString());
                form.setTelefone(telefoneEt.getText().toString());
                form.setEmail(emailEt.getText().toString());
                form.setListaEmails(listaEmailCb.isChecked());
                String sexo = (masculinoRb.isChecked()) ?
                        masculinoRb.getText().toString() : femininoRb.getText().toString();
                form.setSexo(sexo);
                form.setCidade(cidade.getText().toString());
                form.setUf(uf.getSelectedItem().toString());
            }
        });

    }
}