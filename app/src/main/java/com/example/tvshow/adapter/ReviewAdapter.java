package com.example.tvshow.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tvshow.R;
import com.example.tvshow.databinding.ItemReviewBinding;
import com.example.tvshow.model.ReviewResponse;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ReviewViewHolder> {

    private List<ReviewResponse.ResultsReview> resultsReviews;

    private Context context;

    public ReviewAdapter(List<ReviewResponse.ResultsReview> resultsReviews){
        this.resultsReviews = resultsReviews;

        this.context = context;
    }

    @NonNull
    @Override
    public ReviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_review,parent,false);

        return new ReviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewViewHolder holder, int position) {

        holder.itemReviewBinding.labelReview.setText(resultsReviews.get(position).getAuthor());
        holder.itemReviewBinding.contentReview.setText(resultsReviews.get(position).getContent());
    }

    @Override
    public int getItemCount() {
        return resultsReviews.size();
    }

    public class ReviewViewHolder extends RecyclerView.ViewHolder {

        ItemReviewBinding itemReviewBinding;

        public ReviewViewHolder(@NonNull View itemView) {
            super(itemView);

            itemReviewBinding = DataBindingUtil.bind(itemView);
        }
    }
}
