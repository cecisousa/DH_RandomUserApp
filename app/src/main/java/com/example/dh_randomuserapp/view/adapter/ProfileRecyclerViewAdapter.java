package com.example.dh_randomuserapp.view.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dh_randomuserapp.R;
import com.example.dh_randomuserapp.model.Result;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ProfileRecyclerViewAdapter extends RecyclerView.Adapter<ProfileRecyclerViewAdapter.ViewHolder> {

    private List<Result> listaResults;

    public ProfileRecyclerViewAdapter (List<Result> listaResults) {
        this.listaResults = listaResults;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Result result = listaResults.get(position);
        holder.onBind(result);
    }

    @Override
    public int getItemCount() {
        return listaResults.size();
    }

    public void atualizaItem(List<Result> novaLista) {
        this.listaResults.clear();
        this.listaResults = novaLista;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagem;
        private TextView titulo;
        private TextView nome;
        private TextView sobrenome;
        private TextView email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagem = itemView.findViewById(R.id.fotoPerfil);
            titulo = itemView.findViewById(R.id.titulo);
            nome = itemView.findViewById(R.id.nome);
            sobrenome = itemView.findViewById(R.id.sobrenome);
            email = itemView.findViewById(R.id.email);
        }

        public void onBind(Result result) {
            Picasso.get().load(result.getPicture().getLarge()).into(imagem);
            titulo.setText(result.getName().getTitle());
            nome.setText(result.getName().getFirst());
            sobrenome.setText(result.getName().getLast());
            email.setText(result.getEmail());
        }
    }
}
