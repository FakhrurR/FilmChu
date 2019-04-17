package com.example.tvshow.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.tvshow.Links;
import com.example.tvshow.R;
import com.example.tvshow.adapter.TVShowAdapter;
import com.example.tvshow.adapter.VideoAdapter;
import com.example.tvshow.databinding.ActivityDetailBinding;
import com.example.tvshow.model.TVResponse;
import com.example.tvshow.model.TVVideoResponse;
import com.example.tvshow.rest.TVService;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    private ActivityDetailBinding activityDetailBinding;

    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_detail);

        pDialog = new ProgressDialog(DetailActivity.this);
        pDialog.setMessage("Please Wait...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(true);
        pDialog.show();

        TVResponse.ResultsTVShow tv = getIntent().getParcelableExtra("tv_intent");

        activityDetailBinding = DataBindingUtil.setContentView(this,R.layout.activity_detail);

        detailview(tv);
        initRecyclerView();
        detailvideo(tv.getId());
    }

    private  void detailview(TVResponse.ResultsTVShow tv){
        activityDetailBinding.detiltop.detiltitle.tvTitle.setText(tv.getName());
        activityDetailBinding.detiltop.detiltitle.tvReleaseDate.setText(tv.getFirstAirDate());

        activityDetailBinding.detilbottom.review.setText(tv.getOverview());

        Glide.with(this).load(Links.POSTER_BASE_URL + tv.getPosterPath()).into(activityDetailBinding.detiltop.posterImage);

        Glide.with(this).load(Links.BACKDROP_BASE_URL + tv.getBackdropPath()).into(activityDetailBinding.detiltop.backropImage);
    }

    private void initRecyclerView() {
        LinearLayoutManager layoutManager =
                new LinearLayoutManager(DetailActivity.this, LinearLayoutManager.HORIZONTAL,
                        false);
        activityDetailBinding.detilbottom.rvVideo.setLayoutManager(layoutManager);
    }

    private void detailvideo(int tv_id){
        TVService.getAPI().getTVVideos(tv_id,"a19e94729a2c8e318cfd20f0c661b21f").enqueue(new Callback<TVVideoResponse>() {
            @Override
            public void onResponse(Call<TVVideoResponse> call, Response<TVVideoResponse> response) {
                if(response.isSuccessful()) {
                    pDialog.dismiss();
                    List<TVVideoResponse.ResultsTVVideo> video = response.body().getResults();
                    VideoAdapter adapter = new VideoAdapter(video);
                    activityDetailBinding.detilbottom.rvVideo.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<TVVideoResponse> call, Throwable t) {

                pDialog.dismiss();
                Toast.makeText(DetailActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}
