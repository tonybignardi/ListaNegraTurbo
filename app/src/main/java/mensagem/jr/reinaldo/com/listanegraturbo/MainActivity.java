package mensagem.jr.reinaldo.com.listanegraturbo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    List<Pessoa> pessoas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //
        //
        //
        // pessoas = (ArrayList<Pessoa>) Pessoa.getPessoas();
        PessoaDAO pdao = new PessoaDAO(this);
        pdao.open();
        Pessoa p1 = new Pessoa("EDER","HUMMMMM",Color.BLUE);

        pdao.criar(p1);
        Pessoa p2 = new Pessoa("MANOEL","TA GATINHO!!!",Color.RED);
        pdao.criar(p2);

        Pessoa p3 = new Pessoa("RODRIGO"," ATRASADO!!!!",Color.BLUE);
        pdao.criar(p3);





        pessoas = pdao.getAll();
        pdao.close();


        ListaAdapter adapter = new ListaAdapter(this,pessoas);
        ListView lv = (ListView) findViewById(R.id.listagem);
        lv.setAdapter(adapter);

    }
    public void criarPessoa(View view)
    {
        Intent i= new Intent(MainActivity.this,NovaPessoa.class);
        startActivity(i);
    }




}
