package br.edu.ifsp.scl.ads.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

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
    private EditText cidadeEt;
    private Spinner ufSp;

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
        cidadeEt = findViewById(R.id.cidadeEt);
        ufSp = findViewById(R.id.ufSp);
        salvarBt = findViewById(R.id.salvarBt);
        limparBt = findViewById(R.id.limparBt);

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
                form.setCidade(cidadeEt.getText().toString());
                form.setUf(ufSp.getSelectedItem().toString());

                Context contexto = getApplicationContext();
                String texto = form.toString();
                int duracao = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(contexto, texto, duracao);
                toast.show();
            }
        });

        limparBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nomeEt.setText("");
                telefoneEt.setText("");
                emailEt.setText("");
                listaEmailCb.setChecked(false);
                masculinoRb.setChecked(true);
                cidadeEt.setText("");
                ufSp.setSelection(0);
            }
        });
    }
}