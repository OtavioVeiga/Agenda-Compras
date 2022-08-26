package br.unigran.listacompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText nome;
    EditText marca;
    EditText quant;
    ArrayList<listagem> salvar;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = findViewById(R.id.nome);
        marca = findViewById(R.id.produto);
        quant = findViewById(R.id.quantidade);
        salvar = new ArrayList();
        lista =findViewById(R.id.lista);
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, salvar);
        lista.setAdapter(adapter);

    }
    public void salvar (View view){
        listagem Listagem = new listagem();
        Listagem.setNome(nome.getText().toString());
        Listagem.setMarca(marca.getText().toString());
        Listagem.setQuant(quant.getText().toString());
        salvar.add(Listagem);
        Toast.makeText(this,"Produto salvo!!!", Toast.LENGTH_SHORT).show();


    }
}