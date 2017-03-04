package com.chanson.library.sample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.chanson.library.DividerItemDecoration;
import com.chanson.library.RefreshRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Chanson1024 on 2017/3/4
 * Email: lovezww2011@gmail.com
 * GitHub: https://github.com/chanson1024
 */

public class MainActivity extends Activity {

    private RecyclerView mRecyclerView;
    private MyAdapter mMyAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        initRecyclerView();
        initAdapter();
        loadData();
    }

    private void initRecyclerView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));
    }

    private void initAdapter() {
        mMyAdapter=new MyAdapter(this);
        mRecyclerView.setAdapter(mMyAdapter);

        //点击事件
        mMyAdapter.setOnItemClickListener(new RefreshRecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onClick(View view, Object item, int position) {
                Toast.makeText(MainActivity.this,"item clicked!",Toast.LENGTH_SHORT).show();
            }
        });




    }

    private void loadData() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mMyAdapter.addFirstDataSet(generateMockDataSet());
            }
        },1000);

    }

    //测试数据
    private List<FilmModel> generateMockDataSet() {
        List<FilmModel> mockData = new ArrayList<>();
        for (int id = 1; id < 30; id++) {
            FilmModel film = new FilmModel("豆瓣电影","2020-10-"+id);
            mockData.add(film);
        }
        return mockData;
    }
}
