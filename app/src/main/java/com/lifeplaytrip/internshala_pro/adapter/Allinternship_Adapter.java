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

import com.lifeplaytrip.internshala_pro.R;
import com.lifeplaytrip.internshala_pro.model.Allinternship;
import com.lifeplaytrip.internshala_pro.model.City;

import java.util.List;

/**
 * Created by LifePlayTrip on 5/12/2018.
 */

public class Allinternship_Adapter extends RecyclerView.Adapter<Allinternship_Adapter.MyViewHolder> {
    private Context context;
    private List<Allinternship> allinternshipList;

    //declare interface
    private Allinternship_Adapter.News_OnItemClicked onClick;

    //make interface like this
    public interface News_OnItemClicked {
        void news_onItemClick(int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView job_name, company_name, start_date, location, duration, stipend, apply_by;
        public CardView cardview_all;

        public MyViewHolder(View view) {
            super(view);
            job_name = (TextView) view.findViewById(R.id.job_name);
            company_name = (TextView) view.findViewById(R.id.company_name);
            location = (TextView) view.findViewById(R.id.location);
            start_date = (TextView) view.findViewById(R.id.start_date);
            duration = (TextView) view.findViewById(R.id.duration);
            stipend = (TextView) view.findViewById(R.id.stipend);
            apply_by = (TextView) view.findViewById(R.id.apply_by);
            cardview_all = (CardView) view.findViewById(R.id.cardview_all);

        }
    }

    public Allinternship_Adapter(Context context, List<Allinternship> allinternshipList) {
        this.context = context;
        this.allinternshipList = allinternshipList;
    }

    @Override
    public Allinternship_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.allinternship_item, parent, false);

        return new Allinternship_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final Allinternship_Adapter.MyViewHolder holder, final int position) {
        Allinternship allinternship = allinternshipList.get(position);
        // holder.cityTextView.setText(city.getCity_name());
//        Glide.with(context).load(game.getWin_status_image()).into(holder.win_status_image);
        holder.cardview_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClick.news_onItemClick(position);
            }
        });
    }


    public void setOnClick(Allinternship_Adapter.News_OnItemClicked onClick) {
        this.onClick = onClick;
    }

    @Override
    public int getItemCount() {
        return allinternshipList.size();
    }
}
