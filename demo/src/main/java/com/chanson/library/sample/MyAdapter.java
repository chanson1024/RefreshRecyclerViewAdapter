package com.chanson.library.sample;

import android.content.Context;
import android.util.Log;

import com.chanson.library.BaseViewHolder;
import com.chanson.library.RefreshRecyclerViewAdapter;

/**
 * Created by Chanson1024 on 2017/3/4
 * Email: lovezww2011@gmail.com
 * GitHub: https://github.com/chanson1024
 */

public class MyAdapter extends RefreshRecyclerViewAdapter<FilmModel> {

    public MyAdapter(Context context){
        super(context);
    }


    @Override
    protected void bindDataToItemView(BaseViewHolder holder, FilmModel item, int position) {
        holder.setText(R.id.tv_name,item.name);
        holder.setText(R.id.tv_time,item.time);
    }

    @Override
    protected int getItemViewLayoutId(int position, FilmModel item) {
        return R.layout.item;
    }
}
