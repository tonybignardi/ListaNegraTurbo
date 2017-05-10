package mensagem.jr.reinaldo.com.listanegraturbo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tony on 09/05/2017.
 */

public class PessoaDAO {
    public SQLiteDatabase banco;
    public BancoHelper bancoHelper;
    public String[] colunas ={"id","nome","motivo","cor"};
        // select id,nome,motivo,cor from pessoa;
    public PessoaDAO(Context c)
    {
        bancoHelper = new BancoHelper(c);
    }
    public void open()
    {
        banco = bancoHelper.getWritableDatabase();

    }
    public void close()
    {
        bancoHelper.close();
    }

    public void deletar(Pessoa p )
    {
        banco.delete("pessoa","id="+p.getId(),null);
    }

    public void criar(Pessoa p)
    {
        ContentValues valores = new ContentValues();
        valores.put("nome",p.getNome());
        valores.put("motivo",p.getMotivo());
        valores.put("cor",p.getCor());
        banco.insert("pessoa",null,valores);
    }

    public void atualizar(Pessoa p)
    {
        ContentValues valores = new ContentValues();
        valores.put("nome",p.getNome());
        valores.put("motivo",p.getMotivo());
        valores.put("cor",p.getCor());
        banco.update("pessoa",valores,"id="+p.getId(),null);
    }

    public List<Pessoa> getAll()
    {
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Cursor cursor = banco.query("pessoa",colunas,null,null,null,null,"id desc",null);
        cursor.moveToFirst() ;
        while(!cursor.isAfterLast())
        {
            Pessoa p = new Pessoa(cursor.getString(1),cursor.getString(2),cursor.getInt(3));

            lista.add(p);
            cursor.moveToNext();
        }
        return lista;

    }


}
