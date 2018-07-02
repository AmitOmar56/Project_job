package com.lifeplaytrip.internshala_pro.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.model.City;

import java.util.List;


/**
 * Created by LifePlayTrip on 5/11/2018.
 */

public class City_Adapter extends RecyclerView.Adapter<City_Adapter.MyViewHolder> {
    private Context context;
    private List<City> cityList;

    //declare interface
    private City_Adapter.News_OnItemClicked onClick;

    //make interface like this
    public interface News_OnItemClicked {
        void news_onItemClick(int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView cityTextView;
        public ImageView cityImageView;
        public ImageButton edit_education_btn;
        public CardView card_view;

        public MyViewHolder(View view) {
            super(view);
            cityImageView = (ImageView) view.findViewById(R.id.cityImageView);
            cityTextView = (TextView) view.findViewById(R.id.cityTextView);
            card_view = (CardView) view.findViewById(R.id.card_view);
            edit_education_btn = (ImageButton) view.findViewById(R.id.edit_education_btn);
        }
    }

    public City_Adapter(Context context, List<City> cityList) {
        this.context = context;
        this.cityList = cityList;
    }

    @Override
    public City_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.home_item, parent, false);

        return new City_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final City_Adapter.MyViewHolder holder, final int position) {
        City city = cityList.get(position);
        holder.cityTextView.setText(city.getCity_name());
        Glide.with(context).load(city.getCity_image()).into(holder.cityImageView);
        holder.card_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.news_onItemClick(position);
            }
        });
    }

    public void setOnClick(City_Adapter.News_OnItemClicked onClick) {
        this.onClick = onClick;
    }

    @Override
    public int getItemCount() {
        return cityList.size();
    }
}
