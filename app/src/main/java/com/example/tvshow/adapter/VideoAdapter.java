package com.example.tvshow.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.tvshow.R;
import com.example.tvshow.databinding.ItemVideoShowsBinding;
import com.example.tvshow.model.TVVideoResponse;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    private List<TVVideoResponse.ResultsTVVideo> resultsTVVideos;

    private Context context;

    public VideoAdapter (List<TVVideoResponse.ResultsTVVideo> resultsTVVideos){

        this.resultsTVVideos = resultsTVVideos;

    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_video_shows, parent, false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {

        final TVVideoResponse.ResultsTVVideo video = resultsTVVideos.get(position);

        Glide.with(context)
                .load("https://i1.ytimg.com/vi/" + video.getKey()+ "/0.jpg")
                .into(holder.itemVideoShowsBinding.videoThumbnail);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("http://www.youtube.com/watch?v=" +video.getKey()));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return resultsTVVideos.size();
    }



    public class VideoViewHolder extends RecyclerView.ViewHolder{

        ItemVideoShowsBinding itemVideoShowsBinding;

        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);

            itemVideoShowsBinding = DataBindingUtil.bind(itemView);

        }
    }
}
