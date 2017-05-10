package mensagem.jr.reinaldo.com.listanegraturbo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tony on 04/04/2017.
 */

public class ListaAdapter extends BaseAdapter {
    private Context ctx;
    private List<Pessoa> pessoas;

    public ListaAdapter(Context ctx, List<Pessoa> pessoas) {
        this.ctx = ctx;
        this.pessoas = pessoas;
    }

    @Override
    public int getCount() {
        return pessoas.size();
    }

    @Override
    public Object getItem(int position) {
        return pessoas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View visao = LayoutInflater.from(ctx).inflate(R.layout.linha_lista,parent,false);

        Pessoa p = pessoas.get(position);

        TextView tvnome= (TextView) visao.findViewById(R.id.tvnome);
        tvnome.setText(p.getNome());

        TextView tvmotivo = (TextView) visao.findViewById(R.id.tvmotivo);
        tvmotivo.setText(p.getMotivo());

        TextView tvcor = (TextView) visao.findViewById(R.id.tvcor);
        tvcor.setBackgroundColor(p.getCor());


        return visao;
    }
}
