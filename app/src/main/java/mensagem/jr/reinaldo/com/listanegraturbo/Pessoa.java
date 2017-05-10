package mensagem.jr.reinaldo.com.listanegraturbo;

import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 04/04/2017.
 */

public class Pessoa {
    private int id;
    private String nome;
    private String motivo;
    private int cor;



    public Pessoa(String nome, String motivo, int cor) {
        this.nome = nome;
        this.motivo = motivo;
        this.cor = cor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    public static List<Pessoa> getPessoas()
    {
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa("TIAGO NOLASIO","não entregou tarefa", Color.BLACK));
        pessoas.add(new Pessoa("EDER JUNIOR","conversador", Color.BLUE));
        pessoas.add(new Pessoa("RODRIGO ALPHA","copia fajuta", Color.GREEN));
        pessoas.add(new Pessoa("WAGNER BELLA","tomou multa", Color.YELLOW));
        pessoas.add(new Pessoa("ISMAEL","Perai teacher!", Color.RED));
        pessoas.add(new Pessoa("MARCIA","tranquila!!!", Color.CYAN));

        return pessoas;


    }




}
