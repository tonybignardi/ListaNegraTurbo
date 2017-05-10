package mensagem.jr.reinaldo.com.listanegraturbo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by tony on 09/05/2017.
 */

public class BancoHelper extends SQLiteOpenHelper {
    public static String BANCO_NOME="ln.db";
    public static int BANCO_VERSAO=1;

    public BancoHelper(Context context) {

        super(context, BANCO_NOME, null, BANCO_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL = "create table pessoa(id integer primary key autoincrement," +
                "nome text, motivo text,cor integer);";
        db.execSQL(SQL);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    }
}
