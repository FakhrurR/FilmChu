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
import com.example.tvshow.databinding.ItemTvShowsBinding;
import com.example.tvshow.model.TVResponse;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class TVShowAdapter extends RecyclerView.Adapter<TVShowAdapter.ShowViewHolder> {

    private List<TVResponse.ResultsTVShow> resultsTVShows;

    private Context context;

    public TVShowAdapter(List<TVResponse.ResultsTVShow> resultsTVShows,Context context){
        this.resultsTVShows = resultsTVShows;

        this.context = context;
    }

    @NonNull
    @Override
    public ShowViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tv_shows,parent,false);

        return new ShowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowViewHolder holder, int position) {

        final TVResponse.ResultsTVShow tv = resultsTVShows.get(position);

        String vote = String.valueOf(tv.getVoteAverage());

        Glide.with(context).load(Links.BACKDROP_BASE_URL + tv.getBackdropPath()).into(holder.itemTvShowsBinding.image);
        holder.itemTvShowsBinding.title.setText(tv.getName());
        holder.itemTvShowsBinding.releaseDate.setText(String.valueOf(tv.getPopularity()));
        holder.itemTvShowsBinding.rate.setText(vote);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra("movie_id", movie.getId());
//                intent.putExtra("movie_title", movie.getTitle());
                intent.putExtra("tv_intent", tv);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return resultsTVShows.size();
    }

    public class ShowViewHolder extends RecyclerView.ViewHolder {

        ItemTvShowsBinding itemTvShowsBinding;

        public ShowViewHolder(@NonNull View itemView) {
            super(itemView);

            itemTvShowsBinding = DataBindingUtil.bind(itemView);
        }
    }
}
