package com.example.tvshow.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;

import com.example.tvshow.R;
import com.example.tvshow.adapter.PopularAdapter;
import com.example.tvshow.adapter.TVShowAdapter;
import com.example.tvshow.databinding.ActivityMainBinding;
import com.example.tvshow.model.TVResponse;
import com.example.tvshow.rest.TVService;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private TVShowAdapter tvShowAdapter;
    private ProgressDialog pDialog;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        pDialog = new ProgressDialog(MainActivity.this);
        pDialog.setMessage("Please Wait...");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(true);
        pDialog.show();

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        layoutpopuler();
        layouttvshows();

        activityMainBinding.swipeR.setColorSchemeColors(R.color.colorAccent,R.color.colorPrimary);
        activityMainBinding.swipeR.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        activityMainBinding.swipeR.setRefreshing(false);
                        layoutpopuler();
                        layouttvshows();
                    }
                },3000);
            }
        });


    }
    public  void layoutpopuler(){
        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this);
        layoutManager1.setOrientation(RecyclerView.HORIZONTAL);
        activityMainBinding.recyclerViewPopuler.setLayoutManager(layoutManager1);

        TVService.getAPI().getPopuler("a19e94729a2c8e318cfd20f0c661b21f").enqueue(new Callback<TVResponse>() {
            @Override
            public void onResponse(Call<TVResponse> call, Response<TVResponse> response) {
                if (response.isSuccessful()) {
                    pDialog.dismiss();
                    List<TVResponse.ResultsTVShow> tv = response.body().getResults();
                    PopularAdapter popularAdapter = new PopularAdapter(tv, MainActivity.this);
                    activityMainBinding.recyclerViewPopuler.setAdapter(popularAdapter);

                }
            }

            @Override
            public void onFailure(Call<TVResponse> call, Throwable t) {
                pDialog.dismiss();
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void layouttvshows(){

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1);
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.VERTICAL);
        activityMainBinding.onTheAir.tvRecycleview.setLayoutManager(gridLayoutManager);
        TVService.getAPI().getTVShows("a19e94729a2c8e318cfd20f0c661b21f").enqueue(new Callback<TVResponse>() {
            @Override
            public void onResponse(Call<TVResponse> call, Response<TVResponse> response) {
                if (response.isSuccessful()) {
                    pDialog.dismiss();
                    List<TVResponse.ResultsTVShow> tv = response.body().getResults();
                    tvShowAdapter = new TVShowAdapter(tv, MainActivity.this);
                    activityMainBinding.onTheAir.tvRecycleview.setAdapter(tvShowAdapter);

                }
            }

            @Override
            public void onFailure(Call<TVResponse> call, Throwable t) {

                pDialog.dismiss();
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }

}
