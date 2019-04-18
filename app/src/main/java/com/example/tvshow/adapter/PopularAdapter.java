package com.example.tvshow.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.tvshow.Links;
import com.example.tvshow.R;
import com.example.tvshow.activity.DetailActivity;
import com.example.tvshow.databinding.ItemListPopularBinding;
import com.example.tvshow.model.TVResponse;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder> {

    private List<TVResponse.ResultsTVShow> resultsTVShows;

    private Context context;

    public PopularAdapter (List<TVResponse.ResultsTVShow> resultsTVShows, Context context){
        this.resultsTVShows = resultsTVShows;

        this.context = context;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_popular,parent,false);

        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {

        final TVResponse.ResultsTVShow tvpopular = resultsTVShows.get(position);

        Glide.with(context).load(Links.POSTER_BASE_URL + tvpopular.getPosterPath()).into(holder.itemListPopularBinding.imagepopular);
        holder.itemListPopularBinding.rate.setText(String.valueOf(tvpopular.getVoteAverage()));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("tv_intent", tvpopular);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsTVShows.size();
    }

    public class PopularViewHolder extends RecyclerView.ViewHolder {

        ItemListPopularBinding itemListPopularBinding;

        public PopularViewHolder(@NonNull View itemView) {
            super(itemView);

            itemListPopularBinding = DataBindingUtil.bind(itemView);
        }
    }
}
